class Solution {
    public int possibleStringCount(String word) {
        char a[]=word.toCharArray();
        int count=0;
        for(int i=0;i<word.length()-1;i++){
            if(a[i]==a[i+1])
            count+=1;
        }
        return count+1;
    }
}