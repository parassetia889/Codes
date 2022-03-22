// { Driver Code Starts
//Initial Template for Java

import java.io.*;
class GFG{
    
    
 // } Driver Code Ends
//User function Template for Java


// complete the function
// the function should return the reversed string
public static String reverseString(String s){
    
  String p = "";
  int i = s.length()-1;
  while(i >= 0){
      p += s.charAt(i);
      i--;
  }
    return p;
    
}


// { Driver Code Starts.
    
    
    public static void main(String args[])throws IOException{
        BufferedReader read = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while( t-- > 0){
            
            String s = read.readLine().trim();
            String reversed = reverseString(s);
            System.out.println(reversed);
        }
    }
}  // } Driver Code Ends