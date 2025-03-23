class Solution {
    public int hammingWeight(int n) {
        String bin=Integer.toBinaryString(n);
        int count=0;
        char a[]=bin.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]=='1'){
                count+=1;
            }
        }
        return count;
    }
}