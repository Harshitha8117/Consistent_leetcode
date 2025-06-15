class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int maxArea = 0;

        while(left < right){
            int minHeight = Math.min(height[left], height[right]);
            int currArea = (right-left) * minHeight;
            maxArea = Math.max(maxArea, currArea);
            if(height[left] < height[right]) left++;
            else right--;
        }

        return maxArea;
    }
}