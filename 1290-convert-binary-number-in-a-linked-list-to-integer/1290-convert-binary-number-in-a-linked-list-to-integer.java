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
    public int getDecimalValue(ListNode head) {
        Queue<Integer> qt = new LinkedList<>();
        int size = -1;
        int res = 0;
        int ans = 0;
        ListNode cur = head;
        while(cur != null){
            qt.add(cur.val);
            size++;
            cur= cur.next;
        }
        while(!qt.isEmpty()){
            ans = qt.poll();
            // System.out.println(ans + " " + size);
            if(ans == 1){
                res += Math.pow(2,size);
                // System.out.println(" "+ans);
            } 
            size = size-1;
        }
        return res;
    }
}