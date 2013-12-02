/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {

        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        if(root == null) return true;
        q.offer(root);
        q.offer(root);
        
        while(!q.isEmpty()){
            TreeNode n1 = q.poll();
            TreeNode n2 = q.poll();
            if(n1 == null && n2 == null) continue;
            if(n1 == null || n2 == null) return false;
            if(n1.val != n2.val) return false;
            
            q.offer(n1.left); q.offer(n2.right);
            q.offer(n1.right); q.offer(n2.left);
        }
        
        return true;
    }
}