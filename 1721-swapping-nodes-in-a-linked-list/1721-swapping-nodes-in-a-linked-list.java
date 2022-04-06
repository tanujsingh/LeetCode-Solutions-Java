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
        ListNode frontNode = head;
        ListNode endNode = head;
        ListNode current = head;
        int count = 0;
        while (current != null) {
            count++;
            
            if(endNode != null) {
                endNode = endNode.next;
            }
            
            if(count == k) {
                frontNode = current;
                endNode = head;
            }
            
            current = current.next;
        }
        
        int temp = frontNode.val;
        frontNode.val = endNode.val;
        endNode.val = temp;
        
        return head;
    }
}