// { Driver Code Starts
//Initial Template for Java

import java.io.*;

class GFG{
    public static void main(String arg[]) throws IOException{
        BufferedReader read = new BufferedReader( new InputStreamReader(System.in));
        
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            
            int answer = firstDigit(n);
            System.out.println(answer);
        }
    }
    
    
 // } Driver Code Ends
//User function Template for Java


// Complete the function
public static int firstDigit(int n){
    
     while (n>9) {
        n = n/10;
    }
    return n;
}

// { Driver Code Starts.
}  // } Driver Code Ends