// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            
            System.out.println(new Solution().recursiveSum(n));
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Solution
{
    // Complete the function
    // N: input element
    public static int recursiveSum(int N)
    {
        return sumN(N,0);
    }
    
    public static int sumN(int n, int sum){
        if(n == 0)
            return sum;
            
            return n+sumN(n-1,sum);
    }
}
