/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> ss = new Stack<TreeNode>();
        ss.push(p);
        ss.push(q);
        while(!ss.isEmpty()){
            TreeNode n1 = ss.pop();
            TreeNode n2 = ss.pop();
            if(n1 == null && n2 == null) continue;
            if(n1 == null || n2 == null) return false;
            if(n1.val != n2.val) return false;
            ss.push(n1.left);
            ss.push(n2.left);
            ss.push(n1.right);
            ss.push(n2.right);
        }
        return true;
    }
}