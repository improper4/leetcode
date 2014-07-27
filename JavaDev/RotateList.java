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
public class RotateList {
    public ListNode rotateRight(ListNode head, int n) {
        if(head == null) return head;
        ListNode nil = new ListNode(-1);
        nil.next = head;
        ListNode tmp = head;
        int cnt = 0, len = 0;
        while(cnt++ < n){
            tmp = tmp.next;
            if(tmp == null && len == 0){
                len = cnt;n %= len;cnt = 0;tmp = head;
            }
        }
        while(tmp != null && tmp.next != null){
            head = head.next;
            tmp = tmp.next;
        }
        tmp.next = nil.next;
        nil.next = head.next;
        head.next = null;
        return nil.next;
    }
}