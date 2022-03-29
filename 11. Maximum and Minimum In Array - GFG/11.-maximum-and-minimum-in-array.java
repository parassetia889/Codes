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
            String str[] = read.readLine().trim().split(" ");
            
            int input[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                input[i] = Integer.parseInt(str[i]);
            }
            
            //int x = Integer.parseInt(read.readLine());
            Get obj = new Get();
            System.out.println(obj.maximumElement(input, n) + " " + obj.minimumElement(input, n));
            
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Get
{
    public static int maximumElement(int arr[],int n)
    {
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            if(i > max)
                max = i;
        }
        return max;
    
    }
    
    public static int minimumElement(int arr[],int n)
    {
        int min = Integer.MAX_VALUE;
        for(int i : arr){
            if(i < min)
                min = i;
        }
        return min;
    }
}

