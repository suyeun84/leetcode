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
    int result = 0;
    public int sumNumbers(TreeNode root) {
        
        dfs(root, root.val);
        
        return result;
    }
    
    public void dfs(TreeNode root, int sum){
        if(root.left == null && root.right == null){
            result += sum;
            return;
        }
        
        if(root.left != null){
            dfs(root.left, sum * 10 + root.left.val);
        }
        if(root.right != null){
            dfs(root.right, sum * 10 + root.right.val);
        }
    }
}