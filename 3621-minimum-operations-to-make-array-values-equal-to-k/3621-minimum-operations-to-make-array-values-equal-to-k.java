import java.util.*;

class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0, greater = 0;
        int lastGreater = -1;
        boolean flag = false;

        for (int num : nums) {
            if (num == k) {
                count++;
            } else if (num > k) {
                if (lastGreater != num) {
                    lastGreater = num;
                    greater++;
                }
            } else {
                flag = true;
            }
        }

        if (count == nums.length) 
        return 0;
        if (flag) 
        return -1;
        return greater;
    }
}