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
