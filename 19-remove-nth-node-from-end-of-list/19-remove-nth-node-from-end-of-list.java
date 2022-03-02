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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;
        
        while(temp != null){
            count++;
            temp = temp.next;
        }
        
        ListNode prev = new ListNode(0);
        ListNode curr = prev;
        curr.next = head;
        for(int i = 0; i < count - n; ++i) {
            curr = head;
            head = head.next;
        }
        curr.next = head.next;
        
        return prev.next;
            
    }
}