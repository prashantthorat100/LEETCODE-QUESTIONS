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
    public int heightofBinaryTree(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftHt = heightofBinaryTree(root.left);
        int rightHt = heightofBinaryTree(root.right);
        return Math.max(leftHt,rightHt)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftD = diameterOfBinaryTree(root.left);
        int leftHt = heightofBinaryTree(root.left);
        int rightD = diameterOfBinaryTree(root.right);
        int rightHt = heightofBinaryTree(root.right);

        int selfD = leftHt + rightHt;
        return Math.max(selfD , Math.max(leftD, rightD));
    }
}