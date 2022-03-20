// { Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {
    
    
 // } Driver Code Ends
//User function Template for Java

public static int LCM(int a, int b){

    
    for(int i=Math.max(a,b);i<a*b;i++){
        if(i%a==0 && i%b==0){
            return i;
        }
    }
    return a*b;
    
    
}

// { Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            System.out.println(LCM(a, b));
        }
        scn.close();
    }
}  // } Driver Code Ends