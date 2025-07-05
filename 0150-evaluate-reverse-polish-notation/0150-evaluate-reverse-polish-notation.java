class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> rev=new Stack<>();

        for(String str:tokens){
            if(str.equals("+")){
                rev.push(rev.pop()+rev.pop());
            }
            else if(str.equals("-")){
                int a = rev.pop();
                int b=rev.pop();
                rev.push(b-a);
            }
            else if(str.equals("*")){
                rev.push(rev.pop()*rev.pop());
            }
            else if(str.equals("/")){
                int a = rev.pop();
                int b=rev.pop();
                rev.push(b/a);
            }
            else{
                rev.push(Integer.parseInt(str));
            }
        }
        return rev.peek();
    }
}