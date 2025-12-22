/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* swapPairs(struct ListNode* head) {
    struct ListNode* prev=NULL;
    struct ListNode* first=head;
    struct ListNode* sec=NULL;
    if(head==NULL||head->next==NULL)
    {
        return head;
    }
    head=head->next;
    while(first!=NULL&&first->next!=NULL)
    {
        sec=first->next;
        first->next=sec->next;
        sec->next=first;
        if(prev!=NULL)
        {
            prev->next=sec;
        }
        prev=first;
        first=first->next;
    }
    return head;
}