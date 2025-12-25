class Solution {
    static int rev(int n){
        int temp=n;
        int dig=0;
        while(temp>0){
            dig=temp%10+dig*10;
            temp/=10;
        }
        return dig;
    }

    public int mirrorDistance(int n) {
        int sol=0;
        sol=Math.abs(n-rev(n));
        return sol;
    }
}