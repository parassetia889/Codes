class ATM {

    long[] notes = new long[5];
    int[]  deno;
    public ATM() {
        deno = new int[]{20,50,100,200,500};
    }
    
    public void deposit(int[] banknotesCount) {
        
        for(int i =0; i<banknotesCount.length; i++)
            notes[i] += banknotesCount[i];
    }
    
    public int[] withdraw(int amount) {
        
        int[] result = new int[5];
        for(int i=4; i>=0; i--){
            int quantity = (int)Math.min(notes[i], amount/deno[i]);
            amount -= quantity*deno[i];
            result[i] = quantity;
        }
        
        
        if(amount != 0)
            return new int[]{-1};
        
        for(int i=0; i<5; i++)
            notes[i] -= result[i];
        
        return result;
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */