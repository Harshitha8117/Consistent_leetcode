class Solution {
    public boolean isPalindrome(String s) {
        String temp=s;
        String chare="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                chare+=s.charAt(i);
            }
        }
        chare=chare.toLowerCase();
        int x=chare.length()-1;
        for(int i=0;i<x;i++){
            if(chare.charAt(i)!=chare.charAt(x)){
                return false;
            }
            x--;
        }
        return true;
    }
}