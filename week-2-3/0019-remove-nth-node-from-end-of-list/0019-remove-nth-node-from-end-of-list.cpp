/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if(head == NULL) return NULL;
        ListNode *pre= NULL;
        ListNode *cur = head;
        int size = 0;
        while(cur != NULL){
            size++;
            cur = cur->next;
        }
        cur = head;
        int i = 0;
        while(i < size - n){
            i++;
            pre = cur;
            cur = cur->next;
        }
        // cout << pre->val << " " << cur->val << endl;
        if(pre == NULL){
            return head->next;
        }
        pre->next = cur->next;
        // delete cur;
        return head;
    }
};