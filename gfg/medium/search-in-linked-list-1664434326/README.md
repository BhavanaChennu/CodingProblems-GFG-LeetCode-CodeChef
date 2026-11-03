# search-in-linked-list-1664434326

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T15:14:58.772Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1)