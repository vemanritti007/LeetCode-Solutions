/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

int numComponents(struct ListNode* head, int* nums, int numsSize) 
{
   int present[10003] = {0};   
    int count = 0;
    for (int i = 0; i < numsSize; i++)
    {
        present[nums[i]] = 1;
    }

    while (head != NULL)
    {
        if (present[head->val] == 1 &&
           (head->next == NULL || present[head->next->val] == 0))
        {
            count++;  
        }
        head = head->next;
    }

    return count;
}