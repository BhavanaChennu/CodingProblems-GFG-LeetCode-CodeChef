# Reverse Using Stack

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string **s**, the task is to reverse the string using stack.

 **Examples:** 

```
Input: s ="GeeksforGeeks"
Output:  skeeGrofskeeG

```

```
Input: s ="Geek"
Output: keeG
```

 **Constraints:** 
1 ≤ s.length() ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T14:29:37.663Z  

```java
class Solution {
    public String reverse(String S) {
        // code here
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < S.length(); i++){
            stack.push(S.charAt(i));
        }
       StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
           reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1)