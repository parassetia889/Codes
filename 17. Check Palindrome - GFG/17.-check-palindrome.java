// { Driver Code Starts
//Initial Template for Java

import java.io.*;
class GFG{
    
    
 // } Driver Code Ends
//User function Template for Java

// function to check if s is palindrome
// It should return true is the given
// string is palindrome otherwise false
public static boolean isPalin(String s){
    
    int i = 0;
    int j = s.length()-1;
    s = s.toUpperCase();
    
    while(i <= j){
        if(s.charAt(i) != s.charAt(j) )
            return false;
            
            i++; j--;
    }
    
    return true;
    
    
}


// { Driver Code Starts.
    
    
    public static void main(String args[])throws IOException{
        BufferedReader read = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while( t-- > 0){
            
            String s = read.readLine().trim();
            
            boolean palindrome = isPalin(s);
            if(palindrome)
            System.out.println("True");
            else
            System.out.println("False");
        }
    }
}  // } Driver Code Ends