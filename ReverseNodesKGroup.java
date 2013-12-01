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
public class ReverseNodesKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode nil = new ListNode(-1);
        nil.next = head;
        ListNode tmp = head;
        ListNode prev = nil;
        ListNode next = null;
        while(tmp != null){
            ListNode last = null;
            for(int i = 0; i < k; i++){
                if(tmp != null){
                    next = tmp.next;
                    tmp.next = last;
                    last = tmp;
                    tmp = next;
                }else{
                    for(int j = i; j > 0; j--){
                        ListNode lastNext = last.next;
                        last.next = tmp;
                        tmp = last;
                        last = lastNext;
                    }
                    return nil.next;
                }
            }
            prev.next.next = tmp;
            ListNode newPrev = prev.next;
            prev.next = last;
            prev = newPrev;
            
        }
        return nil.next;
    }
}