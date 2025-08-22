class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        int n=g.length;
        int m=s.length;
        
        while(i<n && j<m){
            if(s[j]>=g[i]){
                i+=1;
            }
            j++;
        }
        return i;
    }
}


/*class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        int r=0;
        int l =0;
        Arrays.sort(g);
        Arrays.sort(s);

        while(r<n && l<m){
            if(g[r]<=s[l]){
                r+=1;
            }
            l+=1;
        }
        return r;

        
    }
}*/