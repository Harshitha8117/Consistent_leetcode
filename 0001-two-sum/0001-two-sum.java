class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};*/

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int sol=target-nums[i];
            if(map.containsKey(sol) && map.get(sol)!=i){
                return new int[]{i,map.get(sol)};
            }
        }
        return new int[]{};
    }
}