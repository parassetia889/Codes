// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String n = br.readLine().trim();
            Solution obj = new Solution();
            obj.toBinary(n);
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public void toBinary(String N)
    {
        int n = Integer.parseInt(N);
       String s = "";
       while(n > 0){
           s = n%2 + s;
           n /= 2;
       }
       
       System.out.print(s);
    }
}