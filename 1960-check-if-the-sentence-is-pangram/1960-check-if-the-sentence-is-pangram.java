class Solution {
    public boolean checkIfPangram(String sentence) {
        int count=0;
        for(char ch='a';ch<='z';ch++){
            if(!(sentence.contains(sentence.valueOf(ch))))
            count+=1;
        }
        if(count==0)
        return true;
        else
        return false;

    }
}