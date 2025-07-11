class Solution {
    public int hammingWeight(int n) {
        String fir=Integer.toBinaryString(n);
        char ch[]=fir.toCharArray();
        int c=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='1'){
                c++;
            }
        }
        return c;
    }
}