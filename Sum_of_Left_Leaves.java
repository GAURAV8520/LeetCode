// Sum of Left Leaves

/*
 Given the root of a binary tree, return the sum of all left leaves.
A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.

*/
/*

Input: root = [3,9,20,null,null,15,7]
Output: 24
Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.
Example 2:

Input: root = [1]
Output: 0

*/

// my solution

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum=0;
    public void sum(TreeNode root){
        
        if(root == null){
            return ;
        }

        if(root.left != null){
            TreeNode y = root.left;
            if(y.left == null && y.right == null) 
                            sum += y.val;
        }
        
        sum(root.left);
        sum(root.right);
    }
    public int sumOfLeftLeaves(TreeNode root) {

        sum(root);

        return sum;
    }
}

