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
public class ReverseList {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode nil = new ListNode(Integer.MAX_VALUE);
        nil.next = head;
        ListNode tmp = nil;
        int cnt = 0;
        while(++cnt < m){
            tmp = tmp.next;
        }
        ListNode left = tmp;
        tmp = tmp.next;
        ListNode last = null;
        while(cnt++ <= n){
            ListNode nx= tmp.next;
            tmp.next = last;
            last = tmp;
            tmp = nx;
        }
        left.next.next = tmp;
        left.next = last;
        return nil.next;
    }
}