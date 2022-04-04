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
        ListNode temp = head;
        int count = 0;
        
        while(temp != null) {
            temp = temp.next;
            count++;
        }
        temp = head;
        int j = 1;
        while (j <= count - k) {
            temp = temp.next;
            j++;
        }
        
        int i = 1;
        while(i < k) {
            curr = curr.next;                
            i++;
        }
        int value = curr.val;
        curr.val = temp.val;
        temp.val = value;
        return head;
    }
}