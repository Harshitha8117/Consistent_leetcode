class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> ss=new HashSet<>();
        for(int nu:arr){
        Set<Integer> dd=new HashSet<>();
        dd.add(nu);
        for(int num:ss){
        dd.add(num|nu);
        }
        ss=dd;
        set.addAll(ss);
        }
        return set.size();
    }
}



