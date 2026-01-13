class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        List<Integer> li=new ArrayList<>(set);
        Collections.sort(li);
        if(li.size()>=3){
            return li.get(li.size()-3);
        }
        else if(li.size()==2)
        return li.get(li.size()-1);
        return li.get(0);
    }
}