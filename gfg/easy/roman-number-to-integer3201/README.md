# Roman to Integer

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**  in Roman number format, your task is to  **convert**  it to an  **integer**. Various symbols and their values are given below.
 **Note:** I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000

 **Examples:** 

```
Input: s = "IX"
Output: 9
Explanation: IX is a Roman symbol which represents 10 – 1 = 9.
```

```
Input: s = "XL"
Output: 40
Explanation: XL is a Roman symbol which represents 50 – 10 = 40.
```

```
Input: s = "MCMIV"
Output: 1904
Explanation: M is 1000, CM is 1000 – 100 = 900, and IV is 4. So we have total as 1000 + 900 + 4 = 1904.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T17:52:46.335Z  

```java
class Solution {
    public int romanToInteger(String s) {
                Map<Character, Integer> map = new HashMap<>();
                map.put('I', 1);
                map.put('V', 5);
                map.put('X', 10);
                map.put('L', 50);
                map.put('C', 100);
                map.put('D', 500);
                map.put('M', 1000);

                int total = 0;
                int n = s.length();
                for (int i = 0; i < n; i++) {
                    int current = map.get(s.charAt(i));
                    if (i < n - 1 && current < map.get(s.charAt(i + 1))) {
                        total -= current;
                    } else {
                        total += current;
                    }
                }
                return total;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/roman-number-to-integer3201/1)