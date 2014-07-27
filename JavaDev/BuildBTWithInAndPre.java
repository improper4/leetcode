/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BuildBTWithInAndPre {
    public TreeNode buildTree(int[] pre, int[] in) {
        
        return solve(pre, 0, in, 0, in.length-1);
    }
    TreeNode solve(int[] pre, int pi, int[] in, int from, int to){
        TreeNode ans = null;
        for(int i = from; i <= to; i++){
            if(in[i] == pre[pi]){
                ans = new TreeNode(pre[pi]);
                if(i > from)
                    ans.left = solve(pre, pi+1, in, from, i -1);
                if(i < to)
                    ans.right = solve(pre, pi + i- from+1, in, i+1, to);
                break;
            }
        }
        return ans;
    }
}