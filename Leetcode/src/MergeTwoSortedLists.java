
public class MergeTwoSortedLists {
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		ListNode sentinel = new ListNode(0);
		ListNode current = sentinel;
		
		while(l1 != null && l2 != null) {
			if(l1.val < l2.val) {
				current.next = l1;
				l1 = l1.next;
			} else {
				current.next = l2;
				l2 = l2.next;
			}
			current = current.next;
		}		
		current = l1 == null ? l2 : l1;
		
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
