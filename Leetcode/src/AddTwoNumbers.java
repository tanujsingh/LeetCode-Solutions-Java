
public class AddTwoNumbers {	
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

}
