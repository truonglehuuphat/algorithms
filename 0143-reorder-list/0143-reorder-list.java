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
    public void reorderList(ListNode head) {
        ListNode last = null;
        ListNode preLast = null;
        ListNode nextNode = head.next;
        ListNode cur=head;
        while(cur != null && cur.next !=null){
            last = cur;
            while(last!= null && last.next != null){
                // System.out.println("last.val " + last.val);
                preLast = last;
                last = last.next;
            }
            // preLast.next = null;
            // if(preLast.val== cur.val) {
            //     break;
            // }

            // System.out.println("preLast.val " + preLast.val);
            if(preLast == cur) {
                break;
            }
            // System.out.println("last.val " + last.val);
            last.next = cur.next;
            cur.next = last;
            cur = last.next;
            preLast.next = null;

            // System.out.println("cur.val " + cur.val);
            // System.out.println("cur.next.val " + cur.next.val);
            // System.out.println("last.val " + last.val);
            // System.out.println("last.next.val " + last.next.val);
            // System.out.println("head.val " + head.val);
            // System.out.println("24");
            
        }
    }
}