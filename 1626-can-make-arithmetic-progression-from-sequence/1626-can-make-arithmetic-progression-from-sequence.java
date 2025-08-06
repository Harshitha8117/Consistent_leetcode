class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for(int i=1;i<arr.length-1;i++){
            int a=Math.abs(arr[i]-arr[i-1]);
            int b=Math.abs(arr[i+1]-arr[i]);
            if(a!=b)
            return false;
        }
        return true;
    }
}