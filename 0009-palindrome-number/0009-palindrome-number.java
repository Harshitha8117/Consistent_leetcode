class Solution {
    public boolean isPalindrome(int x) {
        int sum=0,temp;
        temp=x;
        while(x>0){
            int digit=x%10;
            sum=(sum*10)+digit;
            x=x/10;
        }
        if(sum==temp)
        return true;
        else 
        return false;
    }
}