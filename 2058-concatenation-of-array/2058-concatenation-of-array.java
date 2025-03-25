class Solution {
    public int[] getConcatenation(int[] nums) {
        int news[]=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            news[i]=nums[i];
        }
        int k=0;
        for(int j=nums.length;j<news.length;j++){
            news[j]=nums[k];
            k++;
        }
        return news;
    }
}