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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode start = head;
        ListNode end = head;
        ListNode current = head;
        int length = 0;
        
        while(current != null) {
            length++;
            if(end != null){
                end = end.next;
            }
            if(length == k) {
                start = current;
                end = head;
            }
            current = current.next;
        }
        
        int temp = start.val;
        start.val = end.val;
        end.val = temp;

        return head;
    }
}