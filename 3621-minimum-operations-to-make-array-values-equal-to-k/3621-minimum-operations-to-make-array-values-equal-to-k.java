import java.util.*;

class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0, a = 0;
        int b = -1;
        boolean flag = false;

        for (int num : nums) {
            if (num == k) {
                count++;
            } else if (num > k) {
                if (b != num) {
                    b = num;
                    a++;
                }
            } else {
                flag = true;
            }
        }

        if (count == nums.length) 
        return 0;
        if (flag) 
        return -1;
        return a;
    }
}