/*class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0 ;
        }
        if(haystack.contains(needle)){
            return haystack.indexOf((needle));
        }
        return -1;
    }
}*/


class Solution {
    public int strStr(String h, String n) {
        int x=h.length();
        int y=n.length();
        if(x<y)
        return -1;
        for(int i=0;i<=x-y;i++){
            int j=0;
            while(j<y && h.charAt(i+j)==n.charAt(j)){
                j++;
            }
            if(j==n.length())
            return i; 
        }
        return -1;
    }
}