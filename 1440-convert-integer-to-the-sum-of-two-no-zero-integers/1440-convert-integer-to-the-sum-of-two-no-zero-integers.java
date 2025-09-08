class Solution {
    public int[] getNoZeroIntegers(int n) {
        List<Integer> li=new ArrayList<>();
        for(int i=1;i<n;i++){
            int sol=n-i;
            if(!Integer.toString(i).contains("0") && !Integer.toString(sol).contains("0")){
                return new int[]{i,sol};
            }
        }
            return new int[]{};
    }
}