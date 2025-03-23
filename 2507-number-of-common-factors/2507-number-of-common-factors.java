class Solution {
    public int commonFactors(int a, int b) {
       int count=0;
       int s=0;
        if(a>b)
        count=a;
        else
        count=b;
        for(int i=1;i<=count;i++){
            if(a%i==0 && b%i==0)
                s+=1;
        }
        return s; 
    }
}