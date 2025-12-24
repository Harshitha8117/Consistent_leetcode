class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=nums[i];
        }
        int k=0;
        for(int i=n;i<nums.length;i++){
            b[k++]=nums[i];
        }
        int l=0,m=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=a[l++];
            }
            else{
                nums[i]=b[m++];
            }
        }
        return nums;
    }
}