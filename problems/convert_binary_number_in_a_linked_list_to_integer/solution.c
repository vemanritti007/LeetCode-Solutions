/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int helper(struct ListNode * head,int result)
{
    if(head==NULL)return result;
    result=result*2+head->val;
    return(helper(head->next,result));
}
int getDecimalValue(struct ListNode* head) 
{
    return (helper(head,0));
}