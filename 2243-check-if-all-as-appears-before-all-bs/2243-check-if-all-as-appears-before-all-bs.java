class Solution {
    public boolean checkString(String s) {
        int count=0;
        char a[]=s.toCharArray();
        for(int i=0;i<s.length()-1;i++){
        if(a[i]=='b'){
            if(a[i+1]=='a'){
                count=-1;
            }
        }
        }
        if(count==0)
        return true;
        else
        return false;
    }
}