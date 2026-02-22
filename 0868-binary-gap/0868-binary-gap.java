class Solution {
    public int binaryGap(int n) {   
        int i=0;
        int c = 0;
        int k = 0;
        int j = 0;
        while(n!=0){
            if((n&1)==1){                
                if(c!=0){
                    j = Math.max(j, i-k);                    
                }
                k = i;
                c++;
            }
            n=n>>1;
            i++;
        }
        return j;
    }
}