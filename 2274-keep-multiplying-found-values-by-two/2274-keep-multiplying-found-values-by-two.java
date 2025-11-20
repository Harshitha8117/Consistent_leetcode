class Solution {
    public int findFinalValue(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        while(set.contains(k)){
            k*=2;
        }
        return k;
    }
}