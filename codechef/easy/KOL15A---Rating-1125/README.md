# KOL15A - Rating 1125

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Processing a string

Given an alphanumeric string made up of digits and lower case Latin characters only, find the sum of all the digit characters in the string.

### Input
- The first line of the input contains an integer T denoting the number of test cases. Then T test cases follow.
- Each test case is described with a single line containing a string S, the alphanumeric string.
### Output
- For each test case, output a single line containing the sum of all the digit characters in that string.
### Constraints
- 1 ≤ T ≤ 1000
- 1 ≤ |S| ≤ 1000, where |S| is the length of the string S.
### Sample 1:
Input
Output

```
1
ab1231da

```

```
7
```

### Explanation:

The digits in this string are 1, 2, 3 and 1. Hence, the sum of all of them is 7.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T13:47:37.809Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t > 0){
            String s = sc.nextLine();
            int sum = 0;
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i)))
                sum = sum + Character.getNumericValue(s.charAt(i));
        }
        
         System.out.println(sum);
            t--;
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/KOL15A)