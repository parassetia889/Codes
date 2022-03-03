class Solution {
   public int numberOfArithmeticSlices(int[] n) {
    int k=n.length;
    if(k<3)
        return 0;
    int s=0,p=0;
    for(int i=0;i<k-2;i++)
    {
        int a=n[i];
        int b=n[i+1];
        int c=n[i+2];
        if(a-b == b-c)
        {
            p++;
            s+=p;
        }
        else
        {
            p=0;
        }
    }
    return s;
}
}