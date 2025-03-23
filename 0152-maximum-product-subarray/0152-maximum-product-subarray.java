class Solution {
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        for (int n : nums) {
            ans = Math.max(ans, n);
        }
        int Max = 1, Min = 1;
        for (int n : nums) {
            int temp = Max * n;
            Max = Math.max(temp, Math.max(Min * n, n));
            Min = Math.min(temp, Math.min(Min * n, n));

            ans = Math.max(ans, Max);
        }

        return ans;        
    }
}