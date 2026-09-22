# Check if Permutation is Substring

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings  **txt** and  **pat** having lowercase letters, the task is to check if any permutation of  **pat**  is a substring of  **txt**.

 **Examples:** 

```
Input: txt = "geeks", pat = "eke"
Output: true
Explanation: "eek" is a permutation of "eke" which exists in "geeks".
```

```
Input: txt = "programming", pat = "rain"
Output: false
Explanation: No permutation of "rain" exists as a substring in "programming".

```

 **Constraints:** 
1 ≤ txt.size() ≤ 105
1 ≤ pat.size() ≤ txt.size()
Both the strings consist of lowercase English alphabets.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-22T16:32:59.047Z  

```java
class Solution {
    boolean search(String txt, String pat) {
        // Write your code here
        int n1 = pat.length();
        int n2 = txt.length();
        
        int count1[] = new int[26];
        int count2[] = new int[26];
        
        if (n1 > n2) return false;
        
        for(int i = 0 ; i < n1; i++){
            count1[pat.charAt(i) - 'a']++;
            count2[txt.charAt(i) - 'a']++;
        }
        for(int i = 0; i < n2 - n1; i++){
            if(Arrays.equals(count1 , count2)){
                return true;
            }
            count2[txt.charAt(i + n1) - 'a']++;
            count2[txt.charAt(i) - 'a']--;
        }
        return Arrays.equals(count1, count2);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-permutation-is-substring/1)