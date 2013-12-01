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
public class AddTwoNum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0, sum = 0;
        ListNode ans = new ListNode(-1);
        ListNode tmp = ans;
        while(l1 != null || l2 != null){
            
            if(l1 != null && l2 != null){
                sum = l1.val + l2.val + c;
                l1 = l1.next;
                l2 = l2.next;
            }else if(l1 != null){
                sum = l1.val + c;
                l1 = l1.next;
            }else if(l2 != null){
                sum = l2.val + c;
                l2 = l2.next;
            }
            ListNode nNode = new ListNode(sum % 10);
            tmp.next = nNode;
            tmp = tmp.next;
            c = sum > 9 ? 1: 0;
        }
        if(c != 0){
            ListNode nNode = new ListNode(c);
            tmp.next = nNode;
        }
        return ans.next;
    }
}