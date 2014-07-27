/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BTZigZagSearch {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> rl = new ArrayList<ArrayList<Integer>>();
        if(root == null) return rl;
        Queue<TreeNode> q = new LinkedList<TreeNode>();  //use only one queue
        q.offer(root);
        q.offer(null);                                   //add a separator between levels
        ArrayList<Integer> currentLevel = new ArrayList<Integer>();
        boolean odd = true;
        while(!q.isEmpty()){
            TreeNode tmp = q.poll();
            if(tmp == null){
                rl.add(currentLevel);
                currentLevel = new ArrayList<Integer>();
                odd = !odd;
                if(!q.isEmpty()) q.offer(null);          //pay attention to the condition
            }else{
                if(odd) currentLevel.add(tmp.val);
                else currentLevel.add(0, tmp.val);
                if(tmp.left != null) q.offer(tmp.left);
                if(tmp.right != null) q.offer(tmp.right);
            }
        }
        return rl;
    }
}