class Solution {
    public double minimumAverage(int[] nums) {
        double[] num=new double[nums.length/2];
        int i=0,j=nums.length-1;
        Arrays.sort(nums);
        int k=0;
        while(i<j){
            double avg=(nums[i]+nums[j])/2.0;
            num[k++]=avg;
            i++;
            j--;
        }
        Arrays.sort(num);
        return num[0];
    }
}