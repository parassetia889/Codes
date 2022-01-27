import java.util.*;
import java.lang.*;
class Solution {
    public int longestPalindrome(String s) {
        
        int[] arr = new int[52];
        for(char c : s.toCharArray()){
            if(c >= 65 && c <= 90)
                arr[c-65]++;
            else
                arr[c-97+26]++;
        }
        
        int oddCount = 0;
        for(int i : arr){
            if(i%2!=0)
                oddCount++;
        }
        if(oddCount == 0)
            return s.length();
        else
            return (s.length() - oddCount + 1);
        
    }
}



