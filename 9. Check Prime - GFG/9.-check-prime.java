// { Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
 // } Driver Code Ends
//User function Template for Java

public static boolean prime(int n){
    
    if(n == 1)  return false;
    if(n == 2 || n == 3)    return true;
    if(n%2 ==0 || n%3 == 0) return false;
    for(int i = 5; i*i <= n ; i++){
        if(n%i ==0 || n%(i+2)==0)
            return false;
    }
    return true;
    
}

// { Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            boolean ans = prime(n);
            if(ans)
            System.out.println("True");
            else
            System.out.println("False");
        }
        scn.close();
    }
}  // } Driver Code Ends