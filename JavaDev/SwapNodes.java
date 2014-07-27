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
public class SwapNodes {
    public ListNode swapPairs(ListNode head) {
        ListNode nil = new ListNode(-1);
        nil.next = head;
        ListNode prev = nil;
        while(head != null && head.next != null){
            ListNode node2 = head.next;
            head.next = node2.next;
            prev.next = node2;
            node2.next = head;
            prev = head;
            head = head.next;
        }
        return nil.next;
    }
}