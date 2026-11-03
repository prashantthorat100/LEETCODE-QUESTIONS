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
    public static void solution(TreeNode root, ArrayList<ArrayList<Integer>> list){
        if(root==null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        ArrayList<Integer> l = new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode currNode = q.remove();
            if(currNode ==null){
                list.add(0,l);
                l = new ArrayList<>();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }
            else{
                l.add(currNode.val);
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }

            }
            
        }
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        solution(root, list);
        return new ArrayList<>(list);
    }
}