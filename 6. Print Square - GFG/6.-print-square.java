// { Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
 // } Driver Code Ends
//User function Template for Java

public static void square(int n){
    //Complete the code given below
    for( int i = 0 ; i < n ; i++ ){
       for( int j = 0 ; j < n ; j++ ){
           if( i == 0 || i == n-1 || j == 0 )
                System.out.print( "* " );
           else if( j == n-1 )
                System.out.print("*");
           else
                System.out.print("  ");
       }
       System.out.println();
   }
}

// { Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int s = scn.nextInt();
            square(s);
        }
        scn.close();
    }
}  // } Driver Code Ends