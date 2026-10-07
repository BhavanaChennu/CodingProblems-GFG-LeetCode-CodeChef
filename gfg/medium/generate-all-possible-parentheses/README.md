# Generate Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a number  **n**, return all the combinations of balanced parentheses of length n.
 **Note:**  A sequence of parentheses is  **balanced**  if every opening bracket has a corresponding closing bracket in the  **correct order**.
For example, "(())", "()()", and "(()())" are balanced, whereas ")()(", "))((", and "()))" are not.

 **Examples:** 

```
Input: n = 6
Output: ["((()))", "(()())", "(())()", "()(())", "()()()"]
Explanation: These are the only possible valid balanced parentheses.
```

```
Input: n = 4
Output: ["(())", "()()"]
Explanation: These are the only possible valid balanced parentheses.
```

 **Constraints:** 
1 ≤ n ≤ 16
n % 2 == 0

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T16:09:56.861Z  

```java
import java.util.ArrayList;

class Solution {
    public ArrayList<String> generateParentheses(int n) {
        ArrayList<String> result = new ArrayList<>();
        int pairs = n / 2; 
        backtrack(result, new StringBuilder(), 0, 0, pairs);
        return result;
    }

    private void backtrack(ArrayList<String> result, StringBuilder current, int open, int close, int pairs) {
        
        if (current.length() == pairs * 2) {
            result.add(current.toString());
            return;
        }

        if (open < pairs) {
            current.append('(');
            backtrack(result, current, open + 1, close, pairs);
            current.deleteCharAt(current.length() - 1); 
        }

        if (close < open) {
            current.append(')');
            backtrack(result, current, open, close + 1, pairs);
            current.deleteCharAt(current.length() - 1); 
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/generate-all-possible-parentheses/1)