/*class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}*/



class Solution{
    public int findMin(int[] nums){
        int min=Integer.MAX_VALUE;
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left);
            if(nums[left]<=nums[mid]){
                if(min>nums[left]){
                    min=nums[left];
                }
                left=mid+1;
            }
            else{
                if(min>nums[mid]){
                    min=nums[mid];
                }
                right=mid-1;
            }
        }
        return min;
    }
}

/*class Solution{
    public int findMin(int[] nums){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min)
            min=nums[i];
        }
        return min;
    }
}*/