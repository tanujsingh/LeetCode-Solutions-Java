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
        if (head == null || k == 0) return head;
        ListNode current = head;
        int count = 0;
        while(current != null && count < k) {
            current = current.next;
            count++;
        }
        
        if (count == k) {
            current = reverseKGroup(current, k);
            while (count != 0) {
                ListNode temp = head.next;
                head.next = current;
                current = head;
                head = temp;
                count--;
            }
            head = current;
        }
        return head;
    }
}
