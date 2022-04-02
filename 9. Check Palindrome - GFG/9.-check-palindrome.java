// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            
            System.out.println(new Solution().isPalin(n)?1:0);
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Solution
{
    // Complete the function
    // N: input element
    static boolean isPalin(int N)
    {
        int rev = rev(N);
        
        return (rev == N);
    }
    
    static int rev(int n){
        int num = 0;
        while(n!=0){
            num = num*10 + n%10;
            n /= 10;
        }
        return num;
    }
}