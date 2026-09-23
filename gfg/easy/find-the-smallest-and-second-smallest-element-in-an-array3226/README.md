# First and Second Smallests

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array,  **arr[]**  of integers, your task is to return the  **smallest**  and  **second smallest**  element in the array. If the smallest and second smallest do not exist, return  **-1.** 

 **Examples:** 

```
Input: arr[] = [2, 4, 3, 5, 6]
Output: [2, 3] 
Explanation: 2 and 3 are respectively the smallest and second smallest elements in the array.
```

```
Input: arr[] = [1, 1, 1]
Output: [-1]
Explanation: Only element is 1 which is smallest, so there is no second smallest element.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T16:21:06.753Z  

```java
class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int first = arr[0], second = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < first){
                int temp = first;
                first = arr[i];
                second = temp;
            }else if(arr[i] < second && arr[i] != first){
                second = arr[i];
            }
        }
        if(second == Integer.MAX_VALUE ){
            list.add(-1);
        }else{
            list.add(first);
            list.add(second);
        }
        return list;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1)