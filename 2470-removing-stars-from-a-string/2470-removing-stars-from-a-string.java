class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '*')
                sb.deleteCharAt(sb.length() - 1); 
            else 
                sb.append(ch);
        }
        return sb.toString();
    }
}






/*
class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        for(char num:s.toCharArray()){
            if(num=='*' && !stack.isEmpty())
                stack.pop();
            else
            stack.push(num);
        }
        StringBuilder sb=new StringBuilder();
        for(char num:stack)
        sb.append(num);
        return sb.toString();
    }
}
*/