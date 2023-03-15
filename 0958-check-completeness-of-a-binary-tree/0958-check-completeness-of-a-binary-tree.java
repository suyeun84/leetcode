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
    //bfs
    public boolean isCompleteTree(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        boolean isNull = false;
        while(!q.isEmpty()){
            TreeNode now = q.poll();
            if(now == null){
                isNull = true;
                continue;
            }
            if(isNull)
                return false;
            q.add(now.left);
            q.add(now.right);
        }
        
        return true;
    }
}