class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        int c=a+b;
        double ans=0;
        int k=0;
        int arr[]=new int[c];
        for(int i=0;i<a;i++){
            arr[k++]=nums1[i];
        }
        for(int i=0;i<b;i++){
            arr[k++]=nums2[i];
        }
        Arrays.sort(arr);
        if(c%2==0){
            ans=(arr[(c/2)-1]+arr[c/2])/2.0;
        }
        else{
            ans=arr[c/2];
        }
        return ans;
    }
}