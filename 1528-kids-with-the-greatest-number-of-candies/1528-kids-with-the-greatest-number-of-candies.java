class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int c=0;
        List<Boolean> res=new ArrayList<>();
        int maxc=0;
        for(int candy:candies){
            maxc=Math.max(candy,maxc);
        }
        for(int candy:candies){
                if((candy+extraCandies)>=maxc){
                    res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }
}