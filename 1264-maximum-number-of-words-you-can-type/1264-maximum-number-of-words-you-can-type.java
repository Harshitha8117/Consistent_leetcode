class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count=0;
        String[] str=text.split(" ");
        for(String num:str){
            boolean flag=true;
            for(int i=0;i<brokenLetters.length();i++){
                if(num.indexOf(brokenLetters.charAt(i))!=-1){
                    flag=false;
                    break;
                }
            }
            if(flag)
            count++;
        }
        return count;
    }
}