// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		//Making an of class Scanner
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); //taking testcase
		
		while(t-- > 0)
		{
		    //Taking total number of elements 
		    int n = sc.nextInt();
		    
		    //Declaring and initializing array arr
		    int arr[] = new int[n]; 
		    for(int i = 0; i < n; i++)
		    {
		        int x = sc.nextInt();
		        arr[i] = x;
		    }
		    
		    //Calling the fillArrayList method
		    ArrayList<Integer>ans = fillArrayList(arr,n);
		    
		    //Printing the elements of the array
		    for(int x : ans)
		    System.out.print(x + " ");
		    
		    System.out.println();
		}
		
	}
	
	
 // } Driver Code Ends
//User function Template for Java


public static ArrayList<Integer> fillArrayList(int arr[], int n)
{
    ArrayList<Integer> al = new ArrayList<>();
    for(int i:arr)
        al.add(i);
        
        
        return al;
}

// { Driver Code Starts.

	
}  // } Driver Code Ends