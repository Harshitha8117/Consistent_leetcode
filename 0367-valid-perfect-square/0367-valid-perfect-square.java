class Solution {
    public boolean isPerfectSquare(int num)   {
       int left=0,right=num;
       while(left<=right){
         int mid=left+(right-left)/2;
         long sq=(long)mid*mid;
         if(sq==num)
         return true;
         else if(num>sq)
            left=mid+1;
         else
         right=mid-1;
       }
       return false;
    }
}