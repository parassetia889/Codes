// { Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
	    Scanner sc =new Scanner(System.in);
	    
	    //taking total count of testcases
	    int t=sc.nextInt();
	    
	    while(t-->0)
	    {
	        //taking the first number
	        int x=sc.nextInt();
	        
	        //taking the second number
	        int y=sc.nextInt();
	        
	        //calling helperFunction which adds 
	        //the two number and return the object
	        Add a=helperFunction();
	        
	        //calling interface function to print
	        //the answer
	        System.out.println(a.addParameters(x,y));
	    }
	}
	
	
 // } Driver Code Ends
//User function Template for Java


/*
The interface looks like 

interface Add {
    public int addParameters(int x, int y);
}
*/
public static Add helperFunction() 
{
    return (a,b)->a+b;
    //Implement the addParameters method that returns x+y. 
}

// { Driver Code Starts.

}

interface Add {
    public int addParameters(int x, int y);
}  // } Driver Code Ends