/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class FlatterBT {
    public void flatten(TreeNode root) {
        helper(root);
    }

    TreeNode helper(TreeNode curr){
        if(curr == null)
            return null;

        TreeNode tail1 = helper(curr.left);
        TreeNode tail2 = helper(curr.right);

        TreeNode temp = curr.right;
        curr.right = curr.left;
        curr.left = null;

        tail1 = tail1==null? curr : tail1; 
        tail1.right = temp;
        return tail2==null? tail1 : tail2;
    }
    /*
    public void flatten(TreeNode root) {
        if(root == null) return;
        TreeNode right = root.right;
        root.right = root.left;
        root.left = null;
        TreeNode ptr = root;
        while(ptr.right != null) ptr = ptr.right;
        ptr.right = right;
        flatten(root.right);
    }
    */
}