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
    public int pairSum(ListNode head) {
        List<Integer> ans = new ArrayList<>();
        int size = 0;
        ListNode cur = head;
        while(cur!=null){
            size++;
            ans.add(cur.val);
            cur = cur.next;
        }
        
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < size / 2;i++){
            int sum = 0;
            sum = ans.get(i) + ans.get(size-1-i);
            res = Math.max(res, sum);
        }

        return res;
    }
}