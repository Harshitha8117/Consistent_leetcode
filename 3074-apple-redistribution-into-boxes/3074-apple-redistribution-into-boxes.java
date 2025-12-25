class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0,sum1=0,c=0,ss=0;
        Arrays.sort(capacity);
        for(int i=0;i<apple.length;i++){
            sum+=apple[i];
        }
        for(int i=0;i<capacity.length;i++){
            sum1+=capacity[i];
        }
        if(sum==sum1){
            return capacity.length;
        }
        else{
            for(int i=capacity.length-1;i>=0;i--){
                ss+=capacity[i];
                c++;
                if(ss>=sum)
                return c;
            }
        }
        return 0;
    }
}