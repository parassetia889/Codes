// { Driver Code Starts
//Initial Template for Java

import java.util.*;

 // } Driver Code Ends
//User function Template for Java

// Design a class as described in the question
// Code here
class MyClass{
    
    public  void display(){
        System.out.println("Hello World");
    }
}
// { Driver Code Starts.


class GFG{
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-- > 0){
            MyClass obj = new MyClass();
            obj.display();
        }
       
    }
}  // } Driver Code Ends