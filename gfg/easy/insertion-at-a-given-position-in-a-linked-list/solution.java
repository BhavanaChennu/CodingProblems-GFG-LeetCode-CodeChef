/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        this.data = x;
        this.next = null;
    }
} */
class Solution {
    public Node insertPos(Node head, int pos, int val) {
        Node newNode = new Node(val);
        
        if (pos == 1) {
            newNode.next = head;
            return newNode;
        }

        int index = 1;
        Node temp = head;

        while (temp != null && index < pos - 1) {
            temp = temp.next;
            index++;
        }
        
        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        }

        return head;
    }
}