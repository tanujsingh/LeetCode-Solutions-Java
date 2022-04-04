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
        ListNode curr = head;
        ListNode node = head;
        int count = 0;
         
        while(node != null) {
            node = node.next;
            count++;
        }

        int i = 1;
        ListNode start = head;
        ListNode end = head;   
        while (curr != null) {
            if (i == k) {
                start = curr; 
            }
            if (i == count - k + 1) {
                end = curr;
            }
            curr = curr.next;
            i++;
        }
        
        int temp = start.val;
        start.val = end.val;
        end.val = temp;

        return head;
    }
}