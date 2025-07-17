class Solution {
    public int mySqrt(int x) {
        long i=0;
        for(i=1;(i*i)<=x;i++);
            return (int)i-1;
    }
}