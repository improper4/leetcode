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
public class MergeKsortedLists {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if(lists.size() == 0) return null;
        ListNode ans = new ListNode(-1);
        ListNode tmp = ans;
        PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(lists.size(), 
            new Comparator<ListNode> (){
           public int compare(ListNode n1, ListNode n2){
               return n1.val - n2.val;
           } 
        });
        for(ListNode node: lists) if(node != null){
            heap.offer(node);
        }
        while(!heap.isEmpty()){
            ListNode now = heap.poll();
            tmp.next = now;
            tmp = now;
            if(now.next != null)
                heap.offer(now.next);
        }
        return ans.next;
    }
}