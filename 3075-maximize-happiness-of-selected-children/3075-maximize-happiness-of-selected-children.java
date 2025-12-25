class Solution {
    public long maximumHappinessSum(int[] happ, int k) {
        Arrays.sort(happ);
        int c=0;
        long res=0;
        for(int i=happ.length-1;i>=happ.length-k;i--){
            if(happ[i]+c>0){
                res+=(long)(happ[i]+c);
            }
            c--;
        }
        return res;
    }
}


