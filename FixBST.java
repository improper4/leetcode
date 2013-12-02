/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class FixBST {
    TreeNode n1, n2, prevNode;
    public void recoverTree(TreeNode root) {
        prevNode = null;
        n1 = null; n2 = null;
        inorder(root);
        
        int tmp = n1.val;
        n1.val = n2.val;
        n2.val = tmp;
    }
    void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        if(prevNode != null && prevNode.val > root.val){
            n2 = root;
            if(n1 == null)
                n1 = prevNode;
            
        }
        prevNode = root;
        inorder(root.right);
    }
}