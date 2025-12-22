/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* createNode(int data)
{
    struct ListNode* nn = (struct ListNode*)malloc(sizeof(struct ListNode));
    nn->next=NULL;
    nn->val=data;
    return nn;
}
struct ListNode* insert(struct ListNode* head,int data)
{
    struct ListNode* nn = createNode(data);
    if(head==NULL)
    {
        return nn;
    }
    struct ListNode* temp=head;
    while(temp->next!=NULL)
    {
        temp=temp->next;
    }
    temp->next=nn;
    return head;
}
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) 
{
    struct ListNode* result=NULL;
    while(list1!=NULL && list2!=NULL)
    {
        if(list1->val==list2->val)
        {
            result=insert(result,list1->val);
            result=insert(result,list2->val);
            list1=list1->next;
            list2=list2->next;
          
        }
        else if(list1->val>list2->val)
        {
            result=insert(result,list2->val);
            list2=list2->next;
        }
        else{
            result=insert(result,list1->val);
            list1=list1->next;
        }
    }
    while(list1!=NULL)
    {
        result=insert(result,list1->val);
        list1=list1->next;
        
    }
     while(list2!=NULL)
    {
        result=insert(result,list2->val);
        list2=list2->next;
        
    }
    return result;
}