class Solution {
    public int[] numberGame(int[] nums) {
        int k=0;
        int a[]=new int[nums.length];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i%2!=0){
                a[k-1]=nums[i];
                k++;
            }
            else{
                a[k+1]=nums[i];
                k++;
            }
        }
        return a;
    }
}