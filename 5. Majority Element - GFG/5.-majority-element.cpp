// { Driver Code Starts
//Initial template for C++

#include<bits/stdc++.h>
using namespace std;


 // } Driver Code Ends
//User function template for C++

class Solution{
  public:
     // Function to find majority element in the array
    // a: input array
    // size: size of input array


 

int majorityElement(int a[], int size)
   {
       map<int,int> mp;
       int currentmax=0;
       int maxi=0;
       
       for(int i=0;i<size;i++)
       {
           mp[a[i]]++;
       }
       int flag;
       for(auto it: mp)
       { 
           if(it.second > currentmax)
           {   flag=0;
               if(it.second>size/2){
               maxi=it.first;
                   flag=1;
               }
               currentmax=it.second;
           }
           
       }
       if(flag==0)
       {
           return -1;
       }
       return maxi;
       
       
       // your code here
       
   }
};

// { Driver Code Starts.

int main(){

    int t;
    cin >> t;

    while(t--){
        int n;
        cin >> n;
        int arr[n];
        
        for(int i = 0;i<n;i++){
            cin >> arr[i];
        }
        Solution obj;
        cout << obj.majorityElement(arr, n) << endl;
    }

    return 0;
}
  // } Driver Code Ends