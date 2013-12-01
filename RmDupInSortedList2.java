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
public class RmDupInSortedList2 {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode nil = new ListNode(-1);
        nil.next = head;
        ListNode last = nil;
        
        while(head != null){
            boolean dup = false;
            while(head.next != null && head.val == head.next.val){
                dup = true;
                last.next = head.next;
                head = head.next;
            }
            if(dup){
                last.next = head.next;
                head = head.next;
                continue;
            }

            last = last.next;
            head = head.next;
        }
        return nil.next;
    }
}