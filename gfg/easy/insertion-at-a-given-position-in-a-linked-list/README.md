# Insert in a Singly Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the  **head** of a Singly Linked List, a position  **pos** and value  **val**. Insert the val data at the given position (1-based index) of the Linked List and return the head of the modified Linked List.

 **Examples:** 

```
Input: head[] = [1, 3], pos = 3, val = 4

Output: 1 -> 3 -> 4
Explanation: After inserting 4 at position 3 we'll get our linked list as - 

```

```
Input: head[] = [1, 2, 9], pos = 2, val = 5

Output: 1 -> 5 -> 2 -> 9
Explanation: After inserting 5 at position 2 we'll get our linked list as -

```

**Constraints:
**1 ≤ number of nodes ≤ 104 
1 ≤ pos ≤ number of nodes + 1
1 ≤ val ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-04T10:18:55.185Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/insertion-at-a-given-position-in-a-linked-list/1)