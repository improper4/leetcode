/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class ValidBST {
    public boolean isValidBST(TreeNode root) {
        return solve(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    boolean solve(TreeNode node, int min, int max){
        if(node == null) return true;
        if(node.val <= min || node.val >= max) return false;
        
        return solve(node.left, min, node.val) & solve(node.right, node.val, max);
    }
}