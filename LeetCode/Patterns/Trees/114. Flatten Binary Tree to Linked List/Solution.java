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

    TreeNode newRoot;
    TreeNode prev;

    public void solution(TreeNode root) {

        if(root == null) {
            return;
        }

        TreeNode newNode = new TreeNode(root.val);

        if(newRoot == null) {
            newRoot = newNode;
            prev = newNode;
        } else {
            prev.right = newNode;
            prev = newNode;
        }

        solution(root.left);
        solution(root.right);
    }

    public void flatten(TreeNode root) {

        if(root == null) {
            return;
        }

        solution(root);

        root.val = newRoot.val;
        root.left = null;
        root.right = newRoot.right;
    }
}