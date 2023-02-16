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
    int result = 1;
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        dfs(root, result);
        
        return result;
    }
    
    public void dfs(TreeNode root, int max){
        if(max > result) result = max;
        if(root.left != null) dfs(root.left, max + 1);
        if(root.right != null) dfs(root.right, max + 1);
    }
}