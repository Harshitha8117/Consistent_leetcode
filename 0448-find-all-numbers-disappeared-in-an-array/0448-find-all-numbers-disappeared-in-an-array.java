class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList a=new ArrayList<>();
        Set<Integer> b=new HashSet<>();

        for(int i:nums){
            b.add(i);
        }

        for(int i=1;i<=nums.length;i++){
            if(!b.contains(i)){
                a.add(i);
            }
        }
        return a;
    }
}