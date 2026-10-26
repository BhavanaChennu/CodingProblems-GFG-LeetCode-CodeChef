# search-in-rotated-array-2

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-26T17:50:01.047Z  

```java
class Solution{
    public boolean search(int[] arr,int key){
        int l=0,h=arr.length-1;
        while(l<=h){
            int m=(l+h)/2;
            if(arr[m]==key)return true;
            if(arr[l]==arr[m]&&arr[m]==arr[h]){l++;h--;continue;}
            if(arr[l]<=arr[m]){
                if(key>=arr[l]&&key<arr[m])h=m-1;
                else l=m+1;
            }else{
                if(key>arr[m]&&key<=arr[h])l=m+1;
                else h=m-1;
            }
        }
        return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/search-in-rotated-array-2/1)