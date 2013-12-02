/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Inorder {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        LinkedList<TreeNode> ss = new LinkedList<TreeNode>();
        TreeNode p = root;
        while(!ss.isEmpty() || p != null){
            if(p != null){
                ss.push(p);
                p = p.left;
            }else{
                p = ss.pop();
                ans.add(p.val);
                p = p.right;
            }
        }
        return ans;
    }
}