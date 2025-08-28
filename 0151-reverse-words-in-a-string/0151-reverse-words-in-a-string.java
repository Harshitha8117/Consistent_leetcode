class Solution {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        String sol="";
        for(int i=str.length-1;i>0;i--){
            sol+=str[i]+" ";
        }
        return sol+str[0];
    }
}

