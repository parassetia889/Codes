// { Driver Code Starts
//Initial Template for Java

import java.math.BigInteger;
import java.util.Scanner;

class Main {
    
    
 // } Driver Code Ends
//User function Template for Java

public static boolean prime(int n){
    
    if(n==0 || n ==1)
        return false;
    BigInteger b =  BigInteger.valueOf(n);
    return b.isProbablePrime(1);
    
    
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
}




  // } Driver Code Ends