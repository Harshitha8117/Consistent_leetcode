class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int sum=0;
        while(x>0){
            int dig=x%10;
            sum=dig+(sum*10);
            x/=10;
        }
        return sum==temp;
    }
}