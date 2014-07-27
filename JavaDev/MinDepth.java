/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class MinDepth {
    public int minDepth(TreeNode root) {
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        
        if(root == null) return 0;
        q.offer(root);
        int lvlNums = 1;
        int lvl = 1;
        while(!q.isEmpty()){
            int cnt = 0;
            for(int i = 0; i < lvlNums; i++){
                TreeNode now = q.poll();
                if(now.right == null && now.left == null){
                    return lvl;
                }
                if(now.right != null){
                    q.offer(now.right);
                    cnt++;
                }
                if(now.left != null){
                    q.offer(now.left);
                    cnt++;
                }
            }
            lvlNums = cnt;
            lvl++;
        }
        return -1;
    }
}