/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public boolean searchKey(Node head, int key) {
        // Code here
        Node temp = head;
        boolean found = false;
        
        while(temp != null){
            if(temp.data == key){
                found = true;
                break;
            }
            temp = temp.next;
        }
        return found;
    }
}