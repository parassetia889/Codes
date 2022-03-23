// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    
	public static void main (String[] args)
	{
	     //Taking input using Scanner class
    	 Scanner sc = new Scanner(System.in);
    	 
    	 //taking count of total testcases
    	 int t = sc.nextInt();
    	 
    	 boolean flag = false;
    	 while(t-- > 0){
    	   
    	   //taking the String
    	   String s=sc.next();
    	   
    	   Geeks obj=new Geeks();
    	   
    	   //calling follPatt() method
    	   //of class Geeks and passing
    	   //String as parameter
    	   obj.follPatt(s);
    	   
    	 }
    }
}


 // } Driver Code Ends
//User function Template for Java



class Geeks{
    
    static void follPatt(String s)
    {
        int n = s.length();
        if(n == 1 || n%2 != 0 || s.charAt(n-1) != 'y'){
            System.out.println("0");
            return;
            
         }
              if(s.charAt(n/2-1) != 'x'){
            System.out.println("0");
            return;
        }
        
            int countX = 0;
            for(char c : s.toCharArray())
            {
                if(c == 'x')    countX++;
            }
            
            if(countX == n/2)
                System.out.println("1");
            
            
    }
}


// { Driver Code Starts.
  // } Driver Code Ends