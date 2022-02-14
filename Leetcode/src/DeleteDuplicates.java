
public class DeleteDuplicates {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(){};
		ListNode(int val){
			this.val = val;
		}
		ListNode (int val, ListNode next){
			this.val = val;
			this.next = next;
		}
	}
	
	public ListNode deleteDuplicates(ListNode head) {
		ListNode current = head;
		
		while(current != null && current.next != null) {
			if(current.val != current.next.val)
				current = current.next;
			else 
				current.next = current.next.next;
		}
		
		return head;
	}
	
		
	public void print(ListNode head) {
		ListNode temp = head;
		while(temp.next != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.print(temp.val);
	}


}
