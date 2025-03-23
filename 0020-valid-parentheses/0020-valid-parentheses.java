class Solution {
    public boolean isValid(String s) {
        char array[] =new char[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++){
            if(top!=-1 && check(array[top],s.charAt(i)))
            top--;
            else
            array[++top]=s.charAt(i);
        }
        if(top==-1)
        return true;
        return false;
    }
    private boolean check(char inside,char outside){
        if(inside == '(' && outside ==')') 
        return true;
        if(inside == '{' && outside =='}') 
        return true;
        if(inside == '[' && outside ==']') 
        return true;
        return false;
    }
}