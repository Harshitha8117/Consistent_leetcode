class Solution {
    public int distributeCandies(int[] candy) {
        Set<Integer> set=new HashSet<>();
        for(int i:candy){
            set.add(i);
        }
        int n=candy.length/2;
        if(set.size()>=n)
        return n;
        return set.size();
    }
}