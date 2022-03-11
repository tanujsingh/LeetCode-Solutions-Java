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
        int length = 0;
        ListNode temp = head;
        while(temp != null) {
            length++;
            temp = temp.next;
        }
        k = k%length;
        if(k == 0) return head;
        ListNode newHead = new ListNode(0);
        ListNode curr = newHead;
        curr.next = head;
        for(int i = 0; i < length - k; ++i) {
            curr = curr.next;
        }
        newHead = curr.next;
        curr.next = null;
        ListNode node = newHead;
        while(node.next != null) {
            node = node.next;
        }
        node.next = head;
        return newHead;
    }
}