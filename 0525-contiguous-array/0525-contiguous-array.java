class Solution {
    public int findMaxLength(int[] nums) {
        int maxx=0;
        int c=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            c+=nums[i]==0?-1:1;
            if(map.containsKey(c)){
                maxx=Math.max(maxx,i-map.get(c));
            }
            else{
                map.put(c,i);
            }
        }
        return maxx;
    }
}



