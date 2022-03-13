/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    Map<Node, Node> visited = new HashMap<>();
    public Node copyRandomList(Node head) {
        if(head == null) {
            return null;
        }
        
        Node oldNode = head;
        Node newNode = new Node(head.val, null, null);
        visited.put(oldNode, newNode);
        
        while(oldNode != null) {
            newNode.next = copiedNode(oldNode.next);
            newNode.random = copiedNode(oldNode.random);
            
            oldNode = oldNode.next;
            newNode = newNode.next;
        }
        
        return visited.get(head);
    }
    
    private Node copiedNode(Node node) {
        if(node == null) {
            return null;
        }
        
        if(visited.containsKey(node)) {
            return visited.get(node);
        }
        
        Node newNode = new Node(node.val, null, null);
        visited.put(node, newNode);
        
        return visited.get(node);
    }
}