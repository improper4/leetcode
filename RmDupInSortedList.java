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
public class RmDupInSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head, last = null;
        
        while(cur != null){
            if(last == null || last.val != cur.val){
                last = cur;
            }else{
                last.next = cur.next;
            }
            
            cur = cur.next;
        }
        return head;
    }
}