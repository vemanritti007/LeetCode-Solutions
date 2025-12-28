/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int preIndex = 0;

int findIndex(int* inorder, int start, int end, int value) {
    for (int i = start; i <= end; i++) {
        if (inorder[i] == value)
            return i;
    }
    return -1;
}

struct TreeNode* helper(int* preorder, int* inorder, int inStart, int inEnd) {
    if (inStart > inEnd)
        return NULL;

    int rootVal = preorder[preIndex++];
    struct TreeNode* root = (struct TreeNode*)malloc(sizeof(struct TreeNode));
    root->val = rootVal;
    root->left = root->right = NULL;

    if (inStart == inEnd)
        return root;

    int mid = findIndex(inorder, inStart, inEnd, rootVal);

    root->left = helper(preorder, inorder, inStart, mid - 1);
    root->right = helper(preorder, inorder, mid + 1, inEnd);

    return root;
}

struct TreeNode* buildTree(int* preorder, int preorderSize, int* inorder, int inorderSize) {
    preIndex = 0;
    return helper(preorder, inorder, 0, inorderSize - 1);
}
