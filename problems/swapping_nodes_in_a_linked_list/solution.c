/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* swapNodes(struct ListNode* head, int k) 
{
    int count=1,x;
    struct ListNode*temp=head,*f=head,*s=head;
    while(temp->next!=NULL)
    {
        temp=temp->next;
        count++;
    }
    for(int i=1;i<k && f!=NULL;i++)
    {
        f=f->next;
    }
    for(int i=1;i<count-k+1 && s!=NULL;i++)
    {
        s=s->next;
    }
    x=s->val;
    s->val=f->val;
    f->val=x;
    return head;
}