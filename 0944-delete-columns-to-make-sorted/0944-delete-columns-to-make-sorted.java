class Solution {
    public int minDeletionSize(String[] str) {
        int n=str.length;
        int m=str[0].length();
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n-1;j++){
                if(str[j].charAt(i)>str[j+1].charAt(i)){
                    c++;
                    break;
                }
            }
        }
        return c;
    }
}