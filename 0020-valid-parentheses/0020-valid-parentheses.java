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
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty())
                return false;
                char top = st.peek();
                if ((c == ')' && top == '(') ||
                    (c == '}' && top == '{') ||
                    (c == ']' && top == '[')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}