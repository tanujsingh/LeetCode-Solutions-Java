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
        ListNode start = head;
        ListNode end = head;
        ListNode iterate = head;
        int count = 0;
        
        while(iterate != null) {
            iterate = iterate.next;
            count++;
        }
        
        int j = 1;
        while (j <= count - k) {
            end = end.next;
            j++;
        }
        
        int i = 1;
        while(i < k) {
            start = start.next;                
            i++;
        }
        
        int temp = start.val;
        start.val = end.val;
        end.val = temp;

        return head;
    }
}