class Solution {
    int[] month = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        
        int a1 = toDays(arriveAlice);
        int a2 = toDays(arriveBob);
        
        int l1 = toDays(leaveAlice);
        int l2 = toDays(leaveBob);
        
        int arr = Math.max(a1, a2);
        int lev = Math.min(l1, l2);
        
        if(arr > lev)
            return 0;
        else
            return lev-arr+1;
    }
    
    public int toDays(String s){
        
        int m = (s.charAt(0)-'0')*10 + s.charAt(1)-'0';
        int d = (s.charAt(3)-'0')*10 + s.charAt(4)-'0';
        
        m--;
        while(m > 0){
            d += month[m];
            m--;
        }
        return d;
    }
}