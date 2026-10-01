# Count Distinct Elements in Every Window

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array  **arr[]**  and a number  **k**. Find the count of distinct elements in every window of size k in the array.

 **Examples:** 

```
Input: arr[] = [1, 2, 1, 3, 4, 2, 3], k = 4
Output: [3, 4, 4, 3]
Explanation:
First window is [1, 2, 1, 3], count of distinct numbers is 3.
Second window is [2, 1, 3, 4] count of distinct numbers is 4.
Third window is [1, 3, 4, 2] count of distinct numbers is 4.
Fourth window is [3, 4, 2, 3] count of distinct numbers is 3.
```

```
Input: arr[] = [4, 1, 1], k = 2
Output: [2, 1]
Explanation:
First window is [4, 1], count of distinct numbers is 2.
Second window is [1, 1], count of distinct numbers is 1.
```

```
Input: arr[] = [1, 1, 1, 1, 1], k = 3
Output: [1, 1, 1]
Explanation: Every window of size 3 in the array [1, 1, 1, 1, 1], contains only the element 1, so the number of distinct elements in each window is 1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-01T12:25:05.087Z  

```java
class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0 , right = k , count = 0;
        for(int i = 0; i < k; i++){
           map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        list.add( map.size());
        while(right < arr.length){
            map.put(arr[right], map.getOrDefault(arr[right], 0)+1);
            if(map.get(arr[left] )> 1){
                map.put(arr[left], map.get(arr[left]) - 1);
            }else if(map.get(arr[left] )== 1){
                map.remove(arr[left]);
            }
            list.add( map.size());
            right++; left++;
            
        }
        return list;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1)