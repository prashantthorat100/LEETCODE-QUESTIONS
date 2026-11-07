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
    
    public int maxLevelSum(TreeNode root) {
        int maxSum = Integer.MIN_VALUE;
        int resLevel = 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int currLevel = 1;
        int sum = 0;
        while(!q.isEmpty()){
            int size = q.size();
            sum = 0;

            for(int i=0;i<size;i++){
                TreeNode curr = q.remove();
                sum += curr.val;
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            if(sum>maxSum){
                maxSum = sum;
                resLevel = currLevel;
            }
            currLevel++;
        }

        return resLevel;
    }
}