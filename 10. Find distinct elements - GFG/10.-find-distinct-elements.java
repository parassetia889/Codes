// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {

    
 // } Driver Code Ends
// User function Template for Java

static int distinct(int arr[], int n) {
    
    int count = 0;
    boolean isDistinct = true;
    
    for(int i = 0; i <n; i++){
        for(int j=i-1; j>=0; j--){
            isDistinct = true;
            if(arr[i] == arr[j]){
                isDistinct = false;
                break;
                
            }
        }
        
        if(isDistinct == true)
            count++;
    }
    
    return count;
}

// { Driver Code Starts.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            System.out.println(distinct(a, n));
        }
    }
}  // } Driver Code Ends