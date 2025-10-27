class Solution {
    public int numberOfBeams(String[] bank) {
        int pro=0,tot=0;
        for(String str:bank){
            int sum=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='1'){
                    sum++;
                }
            }
            if(sum>0){
                tot+=sum*pro;
                pro=sum;
            }
        }
        return tot;
    }
}