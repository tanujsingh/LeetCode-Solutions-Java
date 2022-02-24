/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((n1, n2) -> n1.val - n2.val);
        
        ListNode curr = head;
        while(curr != null){
            pq.add(curr);
            curr = curr.next;
        }

        ListNode sentinel = new ListNode();
        ListNode prev = sentinel;
        while(!pq.isEmpty()){
            ListNode node = new ListNode();
            node = pq.poll();
            node.next = null;
            prev.next = node;
            prev = node;
        }
        
        return sentinel.next;
    }
}