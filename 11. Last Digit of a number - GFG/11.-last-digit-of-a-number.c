// { Driver Code Starts
//Initial Template for C

#include <stdio.h>


 // } Driver Code Ends
//User function Template for C

void utility(int n){

    //just complete below statement
    int ans = n %10;

    //print the result
    printf("%d\n", ans);
}

// { Driver Code Starts.
    
int main() {
	
	int t; scanf("%d", &t);
	while(t--) {
        int n; scanf("%d", &n);
        utility(n);
    }
	
}  // } Driver Code Ends