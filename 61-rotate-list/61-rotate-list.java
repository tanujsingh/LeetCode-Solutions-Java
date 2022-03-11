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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int length = 1;
        ListNode temp = head;
        while(temp.next != null) {
            length++;
            temp = temp.next;
        }
        k = k%length;
        temp.next = head;
        ListNode newHead = new ListNode(0);
        ListNode curr = newHead;
        curr.next = head;
        for(int i = 0; i < length - k; ++i) {
            curr = curr.next;
        }
        newHead = curr.next;
        curr.next = null;
        return newHead;
    }
}