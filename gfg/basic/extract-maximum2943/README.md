# Maximum Number in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an alphanumeric string  **s**  consisting of lowercase letters (a–z), uppercase letters (A–Z), and digits (0–9).

Extract all numeric  **substrings** from  **s**  and return the  **maximum** numeric value among them.

If no numeric substring exists, return -1.

 **Examples:** 

```
Input: s = "100klh564abc365bg"
Output: 564
Explanation: Numeric values in string s are 100, 564 and 365. But 564 is maximum among them. So answer is 564.
```

```
Input: s = "abcdefg"
Output: -1
Explanation: Since there is no numeric value in the string. So answer is -1. 
```

 **Constraints:** 
1 ≤ |s| ≤ 104
-1 ≤ output value ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T07:08:30.704Z  

```java
class Solution {
    static int extractMaximum(String s) {
        // code here
        int max = Integer.MIN_VALUE , current = 0;
        boolean isNumber = false;
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                current = current * 10 + Character.getNumericValue(s.charAt(i));
                isNumber = true;
            }
            else{
                if(isNumber){
                    max = Math.max(max , current);
                    current = 0;
                    isNumber = false;
                }
            }
        }
         if(isNumber){
                    max = Math.max(max , current);
            }
            
            return max == Integer.MIN_VALUE ? -1 : max;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/extract-maximum2943/1)