// { Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long x)
	 {
		// Your code here
        long start = 0;
        long end = x/2;
        long mid = -1;
        
        if(x == 1) return 1;
        
        while(start <= end) {
            mid = (start + end) / 2;
            //System.out.println(mid);
            
            if(mid*mid == x) {
                return mid;
            }
            if(mid*mid < x && (mid+1)*(mid+1) > x) {
                return mid;
            }
            
            if(mid*mid < x) {
                start = mid+1;
            }
            else if(mid*mid > x) {
                end = mid-1;
            }
        }
        
        return -1;
	 }
}
