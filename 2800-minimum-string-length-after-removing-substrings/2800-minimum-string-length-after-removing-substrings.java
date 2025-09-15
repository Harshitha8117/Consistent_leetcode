class Solution {
    public int minLength(String s) {
        char[] stack=new char[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(top>=0 && stack[top]=='A' && ch=='B'){
                top--;
            }
            else if(top>=0 && stack[top]=='C'&& ch=='D'){
                top--;
            }
            else{
                stack[++top]=ch;
            }
        }
        return top+1;




        /*while(s.contains("AB")||(s.contains("CD"))){
            if(s.contains("AB")){
                s=s.replace("AB","");
            }
            if(s.contains("CD")){
                s=s.replace("CD","");
            }
        }
        return s.length();*/
    }
}