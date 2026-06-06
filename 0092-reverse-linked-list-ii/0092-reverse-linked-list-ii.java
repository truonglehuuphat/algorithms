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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int size = 0;
        // ListNode leftNode = null;
        // ListNode rightNode = null;
        // ListNode preNode = null;
        // ListNode nextNode = null;
        ListNode cur = head;
        List<Integer> ans = new ArrayList<>();
        while(cur != null){
            // size++;
            // if(size == left){
            //     leftNode = cur;
            // }
            // if(size == right){
            //     rightNode = cur;
            // }
            ans.add(cur.val);
            cur= cur.next;
        }
        // for(ListNode item = leftNode; item != null && item != rightNode ; item=item.next){
        //     reveredNode.next =item;
        // }
        left--;
        right--;
        while(left < right){
            int temp = ans.get(left);
            ans.set(left, ans.get(right));
            ans.set(right,temp);
            left++; right--;
        }
        for(int d : ans){
            System.out.println(d);
        }
        ListNode reveredNode = new ListNode(ans.get(0));
        ListNode res = reveredNode;
        for(int i = 1; i < ans.size(); i++){
            reveredNode.next = new ListNode(ans.get(i));
            reveredNode = reveredNode.next;
        }
        return res;
    }
}