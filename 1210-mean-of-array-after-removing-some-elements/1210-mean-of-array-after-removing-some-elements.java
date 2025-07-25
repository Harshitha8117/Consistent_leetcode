class Solution {
    public double trimMean(int[] arr) {
        double sum=0;
        Arrays.sort(arr);
        int percent=(int)(arr.length*0.05);
        for(int i=percent;i<(arr.length-percent);i++){
            sum+=arr[i];
        }
        return sum/(arr.length-percent*2);
    }
}



