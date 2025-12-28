/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* removeZeroSumSublists(struct ListNode* head) {
    struct ListNode dummy;
    dummy.val = 0;
    dummy.next = head;

    struct ListNode *temp1 = &dummy;
     while (temp1 != NULL) {
        int sum = 0;
        struct ListNode *temp2 = temp1->next;
        int removed = 0;

        while (temp2 != NULL) {
            sum += temp2->val;

            if (sum == 0) {
                temp1->next = temp2->next;
                removed = 1;
                break;
            }
            temp2 = temp2->next;
        }
        if (!removed) {
            temp1 = temp1->next;
        }
    }

    return dummy.next;
}
