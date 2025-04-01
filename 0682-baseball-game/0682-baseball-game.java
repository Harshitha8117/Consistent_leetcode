class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> res=new Stack<>();

        for(String item:operations){
            if(item.equals("+")){
                int a=res.pop();
                int b=res.peek();
                res.push(a);
                res.push(a+b);
            }
            else if(item.equals("D"))
            res.push(res.peek()*2); 
            else if(item.equals("C"))
            res.pop();
            else
            res.push(Integer.valueOf(item));
        }
        int sum=0;
        while(!res.isEmpty()){
            sum+=res.pop();
        }
        return sum;
    }
}