class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        for(char num:s.toCharArray()){
            if(num=='*'){
                stack.pop();
            }
            else
            stack.push(num);
        }
        StringBuilder sb=new StringBuilder();
        for(char num:stack)
        sb.append(num);
        return sb.toString();
    }
}