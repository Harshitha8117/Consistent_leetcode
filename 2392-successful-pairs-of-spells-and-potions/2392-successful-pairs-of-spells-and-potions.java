import java.util.*;

public class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            long minPotion = (success + spells[i] - 1) / spells[i];
            int index = binarySearch(potions, minPotion);
            result[i] = m - index;
        }
        return result;
    }
    private int binarySearch(int[] potions, long target) {
        int low = 0, high = potions.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (potions[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
