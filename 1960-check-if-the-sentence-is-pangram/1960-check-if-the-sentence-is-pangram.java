class Solution{
    public boolean checkIfPangram(String str){
        Set<Character> set=new HashSet<>();
        for(char num:str.toCharArray()){
            set.add(num);
        }
        if(set.size()==26)
            return true;
        return false;
    }
}



/*class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char ch='a';ch<='z';ch++){
            if(!sentence.contains(sentence.valueOf(ch))){
                return false;
            }
        }
        return true;
    }
}*/