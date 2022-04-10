// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		   
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    Solution obj = new Solution();
		    System.out.println(obj.countOnes(arr, n));
		    
		}
		
	}
}// } Driver Code Ends


//User function Template for Java

class Solution{
    // Function to count number of ones in the binary array
    // N: size of array
    // arr[]: input array
    public static int countOnes(int arr[], int N){
        
       int s  = 0, e = N-1;
       int ans = 0;
       
       if(arr[0] == 0)
            return 0;
        
        if(arr[N-1] == 1)
            return N;
            
       while(s <= e){
           int mid = s + (e-s)/2;
           
           if(arr[mid] == 0)
                e = mid -1;
            else 
                s = mid + 1 ;
            
       }
        return s;
    }
}

