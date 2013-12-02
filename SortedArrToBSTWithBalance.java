/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class sortedArrayToBSTWithBalance {
    public TreeNode sortedArrayToBST(int[] num) {
        return solve(num, 0, num.length -1);
    }
    
    TreeNode solve(int[] num, int from, int to){
        if(from > to) return null;
    
        int mid = (from + to) /2;
        TreeNode ans = new TreeNode(num[mid]);
        ans.left = solve(num, from, mid-1);
        ans.right = solve(num, mid+1, to);
        
        return ans;
    }
}