/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* mergeInBetween(struct ListNode* list1, int a, int b, struct ListNode* list2){
    struct ListNode* f=list1,*s=list1,*temp=list2,*f_prev=NULL,*s_next=NULL;
    while(temp->next!=NULL)
    {
        temp=temp->next;
    }
    for(int i=0;i<a && f!=NULL;i++)
    {
        f_prev=f;
        f=f->next;
    }
    for(int i=0;i<b && s!=NULL;i++)
    {
        s=s->next;
    }
    s_next=s->next;
    if(f_prev==NULL && s_next==NULL)
    {
        return list2;
    }
    else if(f_prev==NULL)
    {
        temp->next=s_next;
        return list1;
    }
    else if(s_next==NULL)
    {
        f_prev->next=list2;
        return list1;
    }
    else{
        f_prev->next=list2;
        temp->next=s_next;
        return list1;
    }
}