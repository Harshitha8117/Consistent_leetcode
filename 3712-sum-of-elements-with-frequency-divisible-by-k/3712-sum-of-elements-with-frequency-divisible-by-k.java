class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int c=0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int sum=0;
            if(entry.getValue()%k==0){
                sum+=entry.getKey();
                c+=sum*entry.getValue();
            }
        }
        return c;
    }
}