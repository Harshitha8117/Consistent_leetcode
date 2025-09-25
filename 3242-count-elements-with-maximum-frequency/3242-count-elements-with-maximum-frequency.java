class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int c=0,max=0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.values()){
            max=Math.max(i,max);
        }
        for(int i:map.values()){
            if(max==i){
                c+=i;
            }
        }
        return c;
    }
}















