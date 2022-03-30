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
            int arr[] = new int[n];
            
            String str[] = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(str[i]);
            
            System.out.println(new Solution().isSorted(arr, n));
            
        }
    }
    
}// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Complete the function


public static int isSorted(int arr[], int n)
   {
      int asc = 0, dsc = 0;
       for (int i = 1; i < n; i++) {
           if (arr[i-1]>arr[i]){
               asc = 1;
               break;
           }
       }
       for (int i = 1; i < n; i++) {
           if (arr[i-1]<arr[i]){
               dsc = 1;
               break;
           }
       }
       if (asc == 1 && dsc == 1)
           return 0;
       return 1;
   }
}

