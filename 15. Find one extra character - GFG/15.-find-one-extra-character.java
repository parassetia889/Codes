// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class Main {

    
 // } Driver Code Ends
//User function Template for Java

public static char extraChar(String s1, String s2){

   //code here
    char ch = s1.charAt(0);
    for(int i = 1; i < s1.length(); i++)
        ch ^= s1.charAt(i);
        
    for(char c : s2.toCharArray())
        ch ^= c;
    return ch;

    
}


// { Driver Code Starts.

    public static void main(String[] args) throws IOException
    {
        BufferedReader read = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while( t-- > 0) {
            String s1 = read.readLine().trim();
            String s2 = read.readLine().trim();
            System.out.println(extraChar(s1, s2));
        }
    }
}




  // } Driver Code Ends