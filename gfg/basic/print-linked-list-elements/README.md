# Print Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given the head of a singly  **linked list**. Return an  **array**  containing the values of the nodes.

 **Examples:** 

```
Input:
    
Output: [1, 2, 3, 4, 5]
Explanation: The linked list contains 5 elements [1, 2, 3, 4, 5]. The elements are printed in a single line.
```

```
Input:
    
Output: [10, 20, 30, 40, 50, 60]
Explanation: The linked list contains 5 elements [10, 20, 30, 40, 50, 60]. The elements are printed in a single line.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T16:16:22.372Z  

```java
/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        Node temp = head;
        while (temp != null) {
            result.add(temp.data);
            temp = temp.next;
        }
        
        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-linked-list-elements/1)