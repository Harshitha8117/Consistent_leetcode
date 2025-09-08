/*class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++){
            int sol=n-i;
            if(!Integer.toString(i).contains("0") && !Integer.toString(sol).contains("0")){
                return new int[]{i,sol};
            }
        }
            return new int[]{};
    }
}*/


class Solution{
    public int[] getNoZeroIntegers(int n){
        for(int i=1;i<n;i++){
            int sol=n-i;
            if(noZero(i) && noZero(sol)){
                return new int[]{i,sol};
            }
        }
        return new int[]{};
    }
    private boolean noZero(int num){
        while(num>0){
            int dig=num%10;
            if(dig==0)
            return false;
            num/=10;
        }
        return true;
    }
}