class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max=-1;
        int sol=0;
        for(int a[]:dimensions){
            int len=a[0],b=a[1];
            double peri=Math.sqrt((double)len*len+(double)b*b);
            if(peri>max){
                max=peri;
                sol=len*b;
            }
            else if(peri==max){
                sol=Math.max(sol,len*b);
            }
        }
        return sol;
    }
}


