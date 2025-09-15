class Solution {
    public int minLength(String s) {
        char[] stack=new char[s.length()];
        int top=-1;
        for(int i=0;i<stack.length;i++){
            char ch=s.charAt(i);
            if(top>=0 && stack[top]=='A' && ch=='B'){
                top--;
            }
            else if(top>=0 && stack[top]=='C' && ch=='D'){
                top--;
            }
            else{
                stack[++top]=ch;
            }
        }
        return top+1;
    }
}