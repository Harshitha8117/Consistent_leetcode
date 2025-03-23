class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int add=a^b;
            int rem=(a&b)<<1;
            a=add;
            b=rem;
        }
        return a;
    }
}