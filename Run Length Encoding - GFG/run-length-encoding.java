// { Driver Code Starts
import java.util.*;
 
class RLEncoding
{
   public static void main(String[] args) 
   {
 
      Scanner sc = new Scanner(System.in);
    
	  int T = sc.nextInt();
	  sc.nextLine();
	  while(T>0)
	  {
		  
		String str = sc.nextLine();
		
		GfG g = new GfG();
		System.out.println(g.encode(str));
		
      
        T--;
	  }
   }
}

// } Driver Code Ends


class GfG
 {
	String encode(String str)
	{
	    
	    
         String ans = str.charAt(0) + "";
        
         if(str.length() == 1)
            return (ans+1);
            
         int count = 1;
         
         for(int i = 1; i < str.length(); i++){
             
             if(str.charAt(i) != str.charAt(i-1)){
                    
                        ans += count;
                        count = 1;
                    
                    ans += str.charAt(i);
                    
             }
             else{
                 count++;
             }
         }
         
            ans += count;
         
         return ans;
	}
	
 }