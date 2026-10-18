# hollow-rectangle-or-square

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-17T15:24:29.186Z  

```java
class Solution {
    public void printHollowRectangle(int n, int m) {
         // code here
         for(int i = 1 ; i <= n; i++){
             for(int j = 1; j <= m; j++){
                 if(i == 1 || i == n || j == 1 || j == m){
                     System.out.print("*");
                 }
                 else{
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }

    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/hollow-rectangle-or-square/1)