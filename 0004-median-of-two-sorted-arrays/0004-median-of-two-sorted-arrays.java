class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int l=n+m;
        double sol=0;
        int k=0;
        int a[]=new int[m+n];
        for(int i=0;i<m;i++){
            a[k++]=nums1[i];
        }
        for(int i=0;i<n;i++){
            a[k++]=nums2[i];
        }
        Arrays.sort(a);
        if(l%2==0){
            sol=(a[(l/2)-1]+a[l/2])/2.0;
        }
        else{
            sol=a[l/2];
        }
        return sol;
    }
}