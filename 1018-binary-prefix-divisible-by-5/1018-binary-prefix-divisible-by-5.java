class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> li=new ArrayList<>();
        int val=0;
        for(int num:nums){
            val=(((val*2)+num)%5);
            li.add(val==0);
        }
        return li;
    }
}