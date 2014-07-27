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
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode smallHead = new ListNode(Integer.MAX_VALUE);
        ListNode large = new ListNode(Integer.MAX_VALUE);
        ListNode small = smallHead, largeHead = large;
        
        small.next = head;
        while(head != null){
            ListNode next = head.next;
            if(head.val < x){
                small.next = head;
                small = small.next;
            }else{
                large.next = head;
                large = large.next;
            }
            head = next;
        }
        large.next = null;
        small.next = largeHead.next;
        
        return smallHead.next;
    }
}