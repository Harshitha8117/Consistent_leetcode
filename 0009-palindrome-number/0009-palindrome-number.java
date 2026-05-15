class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int rev=0;
        while(x>0){
            int dig=x%10;
            rev=dig+rev*10;
            x/=10;
        }
        return rev==temp;
    }
}