class Solution {
    public int[] shuffle(int[] nums, int n) {
        int size=n*2;
        int res[]=new int[size];
        for(int i=0,j=0;i<size;i++){
            if(i%2==0){
                res[i]=nums[j++];
            }
            else{
                res[i]=nums[n++];
            }
        }
        return res;
    }
}