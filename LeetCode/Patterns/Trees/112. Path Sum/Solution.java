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
    public boolean solution(TreeNode root,int sum, int targetSum){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            return root.val+sum ==targetSum;
        }
    
        boolean leftSum = solution(root.left, sum+root.val, targetSum);
        boolean rightSum = solution(root.right, sum+root.val, targetSum);

        return leftSum || rightSum;

    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return solution(root,0, targetSum);
    }
}