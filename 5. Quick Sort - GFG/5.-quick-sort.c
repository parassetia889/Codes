// { Driver Code Starts
//Initial Template for C

#include <stdio.h>

/* Function to print an array */
void printArray(int arr[], int size)
{
    int i;
    for (i=0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

 // } Driver Code Ends
//User function Template for C

//Function to sort an array using quick sort algorithm.
void quickSort(int arr[], int l, int h)
{
    if(h > l){
        int  p = partition(arr, l , h);
        quickSort(arr, l, p-1);
        quickSort(arr, p+1, h);
    }
}
    
int partition (int arr[], int l, int h)
{
   int i = l - 1, p = h;
   for(int j = l; j <h; j++){
       if(arr[j]  < arr[p]){
           i++;
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
       }
       
   }
    int temp = arr[i+1];
       arr[i+1] = arr[h];
       arr[h] = temp;
       
       return i+1;
}

// { Driver Code Starts.
int main()
{
    int arr[1000],n,T,i;
    scanf("%d",&T);
    while(T--){
    scanf("%d",&n);
    for(i=0;i<n;i++)
      scanf("%d",&arr[i]);
    quickSort(arr, 0, n-1);
    printArray(arr, n);
    }
    return 0;
}  // } Driver Code Ends