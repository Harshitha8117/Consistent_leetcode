class Solution {
    public double trimMean(int[] arr) {
        double sum=0;
        Arrays.sort(arr);
        int res=(int)(arr.length*0.05);
        for(int i=res;i<(arr.length-res);i++){
            sum+=arr[i];
        }
        return sum/(arr.length-res*2);
    }
}



