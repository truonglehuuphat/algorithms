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
    ListNode* removeElements(ListNode* head, int val) {
        // node dau tien
        // if(head == NULL) return NULL;
        while(head != NULL && head->val == val) {
            head = head->next;
        }
        if(head == NULL) return NULL;
        ListNode* pre = NULL;
        ListNode* cur = head;
        // node o giua
        
        while(cur != NULL && cur->next != NULL){
            if(cur->val == val){
                pre->next = cur->next;
            } else {
                pre = cur;
            }
            cur = cur->next; 
        }
        // node o cuoi
        if(cur != NULL && cur->val == val){
           pre->next = NULL;
        }
        return head;
    }
};