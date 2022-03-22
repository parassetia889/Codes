// { Driver Code Starts
//Initial Template for Java


import java.util.Scanner;

class Main {
    
    
 // } Driver Code Ends
//User function Template for Java

public static int arraySum(int[] numbers){
    //Just return the sum of the list
    //Don't print here
    int sum = 0;
    for(int i : numbers){
        sum += i;
    }
    
    return sum;
    
    
}

// { Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            int[] numbers = new int[n];
            for(int i = 0; i < n; i++){
                numbers[i] = scn.nextInt();
            }
            System.out.println(arraySum(numbers));
        }
        scn.close();
    }
}  // } Driver Code Ends