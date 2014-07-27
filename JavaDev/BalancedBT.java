/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BalancedBT {
    public boolean isBalanced(TreeNode root) {
        return getLen(root) >= 0;
    }
    
    int getLen(TreeNode node){
        if(node == null) return 0;
        int left = getLen(node.left);
        int right = getLen(node.right);
        if(left < 0 || right < 0 || Math.abs(left -right) > 1) return -1;
        return Math.max(left, right) +1;
    }
}