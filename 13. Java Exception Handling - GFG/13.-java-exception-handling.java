// { Driver Code Starts
//Initial Template for Java
/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        TestClass obj1=new TestClass(a,b);
	        obj1.findMin();
	    }
	}
}


 // } Driver Code Ends
//User function Template for Java

class TestClass
{
    // Add your code here. Define private variables, Constructors to initialize 
    // variables with the given values and a method findMin() which prints the 
    // Minimum value of a$b.
    private int a,b;
    TestClass(int a, int b){
        this.a = a;
        this.b = b;
    }
    
   public void findMin(){
       int min=Math.min((a+b),(a-b));
       int min1=Math.min((a*b),min);
       try{
          int c= a/b;
          System.out.println(Math.min(c,min1));
       }
       catch(Exception e){
           System.out.println(min1);
       }
   }
}

// { Driver Code Starts.
  // } Driver Code Ends