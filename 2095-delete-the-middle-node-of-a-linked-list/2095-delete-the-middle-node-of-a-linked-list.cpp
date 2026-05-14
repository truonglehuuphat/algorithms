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
    ListNode* deleteMiddle(ListNode* head) {
        if(head == NULL) return NULL;
        int size = 0;
        ListNode * temp = head;
        while(temp){
            size++;
            temp= temp->next;
        }
        int mid = size/2;
        if(mid < 1)  return NULL;
        int i = 0; 
        temp = head;
        ListNode * pre = NULL;
        while(i < mid && temp != NULL){
            i++;
            pre = temp;
            temp = temp->next;
        }
        // cout <<  pre->val <<  endl;
        if(temp != NULL){
            pre->next = temp->next;
            temp->next == NULL;
        }
        return head;
    }
};