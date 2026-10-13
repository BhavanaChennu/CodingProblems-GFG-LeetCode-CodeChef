# Count Occurences of Anagrams

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a word  **pat**  and a text  **txt**. Return the count of the occurrences of anagrams of the word in the text.

 **Example 1:** 

```
Input: txt = "forxxorfxdofr", pat = "for"
Output: 3
Explanation: for, orf and ofr appears in the txt, hence answer is 3.

```

 **Example 2:** 

```
Input: txt = "aabaabaa", pat = "aaba"
Output: 4
Explanation: aaba is present 4 times in txt.

```

 **Constraints:** 
1 <= |pat| <= |txt| <= 105
Both strings contain lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T15:51:40.153Z  

```java
class Solution {

    int search(String pat, String txt) {
        // code here
        int n = txt.length();
        int m = pat.length();
        
        if (m > n) return 0;
        
        int[] patFreq = new int[26];
        int[] txtFreq = new int[26];
        
        for (int i = 0; i < m; i++) {
            patFreq[pat.charAt(i) - 'a']++;
            txtFreq[txt.charAt(i) - 'a']++;
        }
        int count = 0;
        if (Arrays.equals(patFreq, txtFreq)) {
            count++;
        }
        for (int i = m; i < n; i++) {
            txtFreq[txt.charAt(i) - 'a']++;
            txtFreq[txt.charAt(i - m) - 'a']--;
            if (Arrays.equals(patFreq, txtFreq)) {
                count++;
            }
        }
        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-occurences-of-anagrams5839/1)