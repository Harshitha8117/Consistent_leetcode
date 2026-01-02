class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num))
            return num;
            set.add(num);
        }
        return -1;
    }
}

/*
class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==nums.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}*/