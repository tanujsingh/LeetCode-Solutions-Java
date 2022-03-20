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
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<Integer> stack = new Stack<>();
        ListNode sentinel = new ListNode();
        ListNode current = sentinel;
        
        while(head != null) {
            stack.push(head.val);
            if(stack.size() == k) {
                while(!stack.isEmpty()) {
                    current.next = new ListNode(stack.pop());
                    current = current.next;
                }
            }
            head = head.next;
        }
        
        if(!stack.isEmpty()) {
            for(int val : stack) {
               current.next = new ListNode(val);
               current = current.next;
            }
        }
        
        return sentinel.next;
    }
}