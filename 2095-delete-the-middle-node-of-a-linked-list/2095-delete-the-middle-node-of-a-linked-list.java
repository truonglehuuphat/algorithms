/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;
        if(head.next.next == null) {
            head.next = null;
            return  head;
        }
       ListNode pre = null;
       ListNode cur = head;
       ListNode fast = head;
       while(fast != null && fast.next != null && fast.next.next != null){
            pre = cur;
            cur = cur.next;
            
            if(fast.next.next == null){
              fast = fast.next;
            } else {
                fast = fast.next.next;
            }
            // System.out.println(cur.val + " " + fast.val);
       }
       if(fast.next == null){
            pre.next = cur.next;
            cur.next = null;
       }
       else if(fast.next.next == null && fast.next != null){
            pre = cur;
            cur = cur.next; 
            pre.next = cur.next;
            cur.next = null;
       }

       return head;
    }
}