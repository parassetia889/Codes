// { Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
 // } Driver Code Ends
//User function Template for Java

public static int gcd(int a, int b){

        
    int x = Math.min(a,b);
    int ans = 1;
    for(int i = 1; i<=x; i++){
        if((a%i==0) &&(b%i==0))
        ans = i;
    }
    
    return ans;

        
}

// { Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int A = scn.nextInt();
            int B = scn.nextInt();
            int ans = gcd(A,B);
            System.out.println(ans);
        }
        scn.close();
    }
}  // } Driver Code Ends