# linked-list-insertion-1587115620

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T15:52:05.379Z  

```java
/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node newNode = new Node(x);
        
        Node temp = head;
        
        if (head == null) {
            return newNode;
        }
        
        while(temp.next != null){
            temp = temp.next ;
        }
        temp.next = newNode;
        return head;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/linked-list-insertion-1587115620/1)