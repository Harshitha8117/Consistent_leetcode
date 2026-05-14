class Solution {
    public boolean isGood(int[] nums) {
        int c=0;
        for(int num:nums){
            c=Math.max(c,num);
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key=entry.getKey();
            int val=entry.getValue();
            if(key!=c && val>1)
            return false;
            if(key==c && val!=2)
            return false;
            if(nums.length!=c+1)
            return false;
        }
        return true;
    }
}