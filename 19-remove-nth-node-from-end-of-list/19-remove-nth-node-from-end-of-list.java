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
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode slow = sentinel;
        ListNode fast = sentinel;
        
        
        int i = 0;
        while(i <= n && fast != null){
            fast = fast.next;
            i++;       
        }
        
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        
        return sentinel.next;
    }
}