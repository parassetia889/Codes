// { Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking count of total testcases
		int t = sc.nextInt();
		
		while(t-->0)
		{
		    //taking total count of elements
		    int n=sc.nextInt();
		    
		    //creating an array of size n
		    int []arr=new int[n];
		    
		    //adding elements to the array
		    for(int i=0;i<n;i++)
		    arr[i]=(sc.nextInt());
		    
		    //calling the method sumUsingStreams
		    //and printing results
		    System.out.println(sumUsingStreams(arr));
		    
		    
		}
	}
	
 // } Driver Code Ends
//User function Template for Java

public static int sumUsingStreams(int []arr)
{
    //Your code here
     return Arrays.stream(arr)
                 .sum(); 
}

// { Driver Code Starts.

	
	
}  // } Driver Code Ends