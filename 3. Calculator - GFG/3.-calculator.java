// { Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
 // } Driver Code Ends
//User function Template for Java

public static void utility(int a, int b, int operator){

    int ans = 0;
    switch(operator){
        case 1:
            ans = a+b;
            break;
        case 2:
            ans = a-b;
            break;
        case 3:
            ans = a*b;
            break;
        
    }
    System.out.print(ans);
    
    
    
}

// { Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            int operator = scn.nextInt();
            utility(a, b, operator);
            System.out.println();
        }
        scn.close();
    }
}  // } Driver Code Ends