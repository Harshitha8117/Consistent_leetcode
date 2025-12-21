class Solution {
    public int minDeletionSize(String[] str) {
        int n=str.length;
        int m=str[0].length();
        boolean[] flag = new boolean[n-1];
        int c=0;
        for(int i=0;i<m;i++){
            boolean bb=false;
            for(int j=0;j<n-1;j++){
                if(!flag[j] && str[j].charAt(i)>str[j+1].charAt(i)){
                    bb=true;
                    break;
                }
            }
            if(bb){
                c++;
                continue;
            }
            for(int j=0;j<n-1;j++){
                if(!flag[j] && str[j].charAt(i)<str[j+1].charAt(i)){
                    flag[j]=true;
                }
            }
        }
        return c;
    }
}



