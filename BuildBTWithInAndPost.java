/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BuildBTWithInAndPost {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return solve(inorder, 0, n-1, postorder, n-1);
    }
    TreeNode solve(int[] in, int inlef, int inrig, int[] post, int rootIdx){
        TreeNode node = null;
        for(int i = inlef; i <= inrig; i++){
            if(in[i] == post[rootIdx]){
                node = new TreeNode(post[rootIdx]);
                if(i > inlef)
                    node.left = solve(in, inlef, i-1, post, rootIdx - inrig +i- 1);
                if(i < inrig)
                    node.right = solve(in, i+1, inrig, post, rootIdx - 1);
                break;
            }
        }
        return node;
    }
}