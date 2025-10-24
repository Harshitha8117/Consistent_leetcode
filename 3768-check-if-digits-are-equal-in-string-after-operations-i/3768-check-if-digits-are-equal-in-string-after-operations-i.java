class Solution {
    public boolean hasSameDigits(String s) {
        int i=0;
        String sol="";
        while(s.length()>2 && i<s.length()-1){
            sol+=(char)(((s.charAt(i)-'0'+s.charAt(i+1)-'0')%10)+'0');
            i++;
            if(s.length()-1==i){
                s=sol;
                i=0;
                sol="";
            }
        }
        return s.length()==2 && s.charAt(0)==s.charAt(1);
    }
}