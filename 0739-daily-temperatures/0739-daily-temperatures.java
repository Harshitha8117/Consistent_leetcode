class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int a[]=new int[temp.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<temp.length;i++){
            while(!stack.isEmpty() && temp[stack.peek()]<temp[i]){
                int rem=stack.pop();
                a[rem]=i-rem;
            }
            stack.push(i);
        }
        return a;
    }
}