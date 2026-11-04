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
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int ln = hOfLeft(root);
        int rn = hOfRight(root);

        if(ln == rn){
            return (1<<(ln))-1;
        }else{
            return countNodes(root.left) + countNodes(root.right)+1;
        }
    }
    public int hOfLeft(TreeNode root){
        int count =0;
        while(root!=null){
            count++;
            root = root.left;
        }
        return count;
    }
    public int hOfRight(TreeNode root){
        int count =0;
        while(root!=null){
            count++;
            root = root.right;
        }
        return count;
    }
}