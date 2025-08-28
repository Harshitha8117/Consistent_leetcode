class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max=-1;
        int sol=0;
        for(int a[]:dimensions){
            int l=a[0],b=a[1];
            double dimen=Math.sqrt((double)l*l+(double)b*b);
            if(dimen>max){
                max=dimen;
                sol=l*b;
            }
            else if(dimen==max){
                sol=Math.max(sol,l*b);
            }
        }
        return sol;
    }
}


