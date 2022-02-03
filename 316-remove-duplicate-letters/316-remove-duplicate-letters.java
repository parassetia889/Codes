class Solution {
    public String removeDuplicateLetters(String s) {
        char arr[]=s.toCharArray();
        
        int freq[]=new int[26];
        boolean flag[]=new boolean[26];
        
		//counting frequency of chars in arr
        for(int i=0;i<arr.length;i++){
            freq[arr[i]-'a']++;
        }
        
        Stack<Character> stk=new Stack<Character>();
        
        for(int i=0;i<arr.length;i++){
            freq[arr[i]-'a']--;    //decreasing frequency of ith char
			
			//if ith char is not in stack already then we check if we should add it or not
            if(!flag[arr[i]-'a']){
			
				//if stack top is greater than ith char and stack top has frequency remaining then we should remove it from here as it can be added further
                while(stk.size()>0 && stk.peek()>arr[i] && freq[stk.peek()-'a']>0){
                    flag[stk.pop()-'a']=false;//stk doesn't have it the char now so making its flag false
                }
				
				//adding ith char and flagging true
                stk.push(arr[i]);
                flag[arr[i]-'a']=true;
            }
			
		
    }
        //finally building string 
        StringBuilder sb=new StringBuilder();
        while(!stk.isEmpty()){
            sb.insert(0,stk.pop());
        }
        return sb.toString();
}
}