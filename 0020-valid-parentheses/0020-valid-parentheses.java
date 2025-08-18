/*class Solution {
    public boolean isValid(String s) {
        char ch[]=new char[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++){
            if(top!=-1 && check(ch[top],s.charAt(i))){
                top--;
            }
            else{
                ch[++top]=s.charAt(i);
            }
        }
        if(top==-1)
        return true;
        return false;
    }

        public boolean check(char inside,char outside){
            if(inside=='(' && outside==')')
            return true;
            if(inside=='[' && outside==']')
            return true;
            if(inside=='{' && outside=='}')
            return true;
            return false;
    }
}*/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }
            else{
                if(stack.isEmpty())
                return false;
                    char top=stack.peek();
                    if((c==')' && top=='(') || 
                    (c=='}' && top=='{') || 
                    (c==']' && top=='[')){
                        stack.pop();
                    }
                    else{
                    return false;
                    }
            }
        }
        return stack.isEmpty();
    }
}



