/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BottomUpOrder {
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        if(root == null) return ans;
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        LinkedList<Integer> qidx = new LinkedList<Integer>();
        q.offer(root);
        qidx.offer(0);
        while(!q.isEmpty()){
            TreeNode now = q.poll();
            int nowIdx = qidx.poll();
            if(ans.size() ==nowIdx){
                ArrayList<Integer> tmp = new ArrayList<Integer>();
                tmp.add(now.val);
                ans.add(0,tmp);
            }else{
                ans.get(0).add(now.val);
            }
            if(now.left != null){
                q.offer(now.left);
                qidx.offer(nowIdx +1);
            }
            if(now.right != null){
                q.offer(now.right);
                qidx.offer(nowIdx +1);
            }
        }
        return ans;
    }
}