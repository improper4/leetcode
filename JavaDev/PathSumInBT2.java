/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class PathSumInBT2 {
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        
        solve(root, sum, ans, new ArrayList<Integer>());
        return ans;
    }
    
    void solve(TreeNode root, int sum, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> tmp){
        if(root == null) return;
        tmp.add(root.val);
        if(root.left == null && root.right == null){
            if(sum == root.val){
                ArrayList<Integer> list = new ArrayList<Integer>(tmp);
                ans.add(list);
            }
        }else{
            solve(root.left, sum - root.val, ans, tmp);
            solve(root.right, sum - root.val, ans, tmp);
        }
        tmp.remove(tmp.size() -1);
    }
}