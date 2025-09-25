class Solution {
    public boolean halvesAreAlike(String s) {
        int first=0,sec=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length()/2;i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                first+=1;
            }
        }
        for(int i=s.length()/2;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                sec+=1;
            }
        }
        return sec==first;
    }
}







