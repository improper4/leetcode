/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BTMaxPath {
    int ans;
    public int maxPathSum(TreeNode root) {
        ans = Integer.MIN_VALUE;
        return Math.max(maxPath(root), ans);
    }
    int maxPath(TreeNode root){
        if(root == null) return 0;
        int left = Math.max(0, maxPath(root.left));
        int right = Math.max(0, maxPath(root.right));
        ans = Math.max(ans, root.val + left + right);
        return Math.max(left, right) + root.val;
    }
    
}