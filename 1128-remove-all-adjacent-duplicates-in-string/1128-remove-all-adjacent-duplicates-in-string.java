class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        String st="";
        if(s.length()==1)
        return s;
        for(char num:s.toCharArray()){
            if(stack.isEmpty() || num!=stack.peek())
                stack.push(num);
            else
            stack.pop();
        }
        while(!stack.isEmpty()){
            st=stack.pop()+st;
        }
        return st;
    }
}

