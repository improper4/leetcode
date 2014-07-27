/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SortedListToBSTWithBalance {
    public TreeNode sortedListToBST(ListNode head) {
        // calculate list length
        int len = 0; ListNode cur = head;
        while (cur!=null) {
            cur = cur.next;
            len++;
        }
        // build the BST
        return listToBST(head, 0, len-1);
    }
    
    private TreeNode listToBST(ListNode head, int low, int high) {
        if (low > high) return null;
        int mid = (low + high) / 2;
        // build up tree recursively
        TreeNode left = listToBST(head, low, mid-1);
        TreeNode root = new TreeNode(head.val);
        root.left = left;
        // Java pass in Object by reference, so we can't change head but we can change its content :)
        if (head.next != null) { // "move to next"
            head.val = head.next.val;
            head.next = head.next.next;
        }
        root.right = listToBST(head, mid+1, high);
        return root;
    }
}