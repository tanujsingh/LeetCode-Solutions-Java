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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode sentinel = new ListNode(0);
        ListNode curr = sentinel;
        sentinel.next = head;
        
        while(head != null) { 
            if(head.next != null && head.val == head.next.val) {
                while(head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                curr.next = head.next;
            } else {
                curr = curr.next;
            }
            
            head = head.next;
            
        }
        
        return sentinel.next;
        
    }
}