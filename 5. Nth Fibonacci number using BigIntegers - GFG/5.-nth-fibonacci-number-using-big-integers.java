// { Driver Code Starts
//Initial Template for Java

import java.math.BigInteger;
import java.util.Scanner;

// Driver class with main function
class Main {
    
    
 // } Driver Code Ends
//User function Template for Java

public static BigInteger fib(int n){
        
    //write your code here
    //return nth fibonacci number in BigInteger
    BigInteger a = new BigInteger("0");
    BigInteger b = new BigInteger("1");
    BigInteger c = new BigInteger("1");
    
    for(int i = 0; i<n; i++){
        c = a.add(b);
        a = b;
        b = c;
    }
    return a;
    
}

// { Driver Code Starts.

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            //Taking input n
            int n = sc.nextInt();

            System.out.println(fib(n));
        }
    }
}  // } Driver Code Ends