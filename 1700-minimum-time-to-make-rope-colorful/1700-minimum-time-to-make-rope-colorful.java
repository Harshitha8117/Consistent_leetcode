class Solution {
    public int minCost(String colors, int[] neededTime) {
        int sum=0;
        int prev=neededTime[0];
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(i)==colors.charAt(i-1)){
                sum+=Math.min(prev,neededTime[i]);
                prev=Math.max(prev,neededTime[i]);
            }
            else{
                prev=neededTime[i];
            }
        }
        return sum;
    }
}