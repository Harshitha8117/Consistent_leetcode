class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> res=new Stack<>();
        for(String op:operations){
            if(op.equals("+")){
                int a=res.pop();
                int b=res.peek();
                res.push(a);
                res.push(a+b);
            }
            else if(op.equals("D")){
                res.push(res.peek()*2);
            }
            else if(op.equals("C")){
                res.pop();
            }
            else{
                res.push(Integer.valueOf(op));
            }
        }

            int sum=0;
            while(!res.isEmpty()){
                sum+=res.pop();
        }
        return sum;
    }
}