import java.util.*;
class Solution {
    public int maxSum(int[] nums) {
        int sol=0;
        Set<Integer> set=new HashSet<>();
        for(int num:nums)
        set.add(num);
        for(int num:set){
            if(num>0)
            sol+=num;
        }
        if(sol==0)
        sol=Collections.max(set);
        return sol;
    }
}