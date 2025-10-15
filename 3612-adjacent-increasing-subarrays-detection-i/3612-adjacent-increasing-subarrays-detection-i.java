class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        for (int i = 0; i <= n - 2 * k; i++) {
            boolean first = true, second = true;

            // Check first subarray
            for (int j = i; j < i + k - 1; j++) {
                if (nums.get(j) >= nums.get(j + 1)) {
                    first = false;
                    break;
                }
            }

            // Check second subarray
            if (first) {
                for (int j = i + k; j < i + 2 * k - 1; j++) {
                    if (nums.get(j) >= nums.get(j + 1)) {
                        second = false;
                        break;
                    }
                }
                if (second) return true;
            }
        }
        return false;
    }
}
