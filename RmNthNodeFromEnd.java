/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class RmNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode nil = new ListNode(-1);
        nil.next = head;
        ListNode cur = nil, tmp = head;
        int cnt = 1;
        while(cnt++ < n){
            tmp = tmp.next;
        }
        while(tmp.next != null){
            cur = cur.next;
            tmp = tmp.next;
        }
        ListNode rm = cur.next;
        cur.next = rm.next;
        rm = null;
        return nil.next;
    }
}