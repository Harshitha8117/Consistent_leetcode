class Solution {
    public int[] sortedSquares(int[] nums) {
        int a=nums.length;
        int sq[]=new int[a];
        for(int i=0;i<a;i++){
            sq[i]=nums[i]*nums[i];
        }
        Arrays.sort(sq);
        return sq;
    }
}