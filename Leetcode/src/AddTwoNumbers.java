import java.util.*;

public class AddTwoNumbers {
	ListNode l1, l2;
	static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { 
			this.val = val; 
			}
		ListNode(int val, ListNode next) { 
			this.val = val; 
			this.next = next; 
		}
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// TODO Auto-generated constructor stub
		ListNode sentinel = new ListNode(0);
		ListNode curr = sentinel;
		int carry = 0;
		
		while(l1 != null || l2 != null) {
			int sum = 0;
			if(l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			} 
			if(l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			
			sum += carry;
			carry = sum/10;
			curr.next = new ListNode(sum%10);
			curr = curr.next;
			
		}
		
		if(carry == 1) curr.next = new ListNode(1);
		
		return sentinel.next;
	}
	
	public void printList(ListNode node) {
		while(node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		
		AddTwoNumbers list = new AddTwoNumbers();
		ListNode a1 = new ListNode(2);
		ListNode a2 = new ListNode(4);
		ListNode a3 = new ListNode(3);
		list.l1 = a1;
		a1.next = a2;
		a2.next = a3;
		list.printList(list.l1);
		
		ListNode b1 = new ListNode(5);
		ListNode b2 = new ListNode(6);
		ListNode b3 = new ListNode(4);
		list.l2 = b1;
		b1.next = b2;
		b2.next = b3;
		list.printList(list.l2);
		
		list.printList(list.addTwoNumbers(list.l1, list.l2));
		
	}
	
	
}
