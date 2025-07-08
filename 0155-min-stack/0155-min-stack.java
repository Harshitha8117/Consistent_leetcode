class MinStack {
    Stack<Integer>st;
    int min=Integer.MAX_VALUE;
    Stack<Integer>minS;
    public MinStack() {
      this.st=new Stack<>();
      this.minS= new Stack<>();
    }
    
    public void push(int val) {
        if(val<=min)
        {
            min=val;
            minS.push(min);
            st.push(val);
        }
        else
        st.push(val);
    }
    
    public void pop() {
        if(minS.peek().equals(st.peek()))
        {
            st.pop();
            minS.pop();
            if(minS.size()>0)
            {
                min=minS.peek();
            }
            else
            min=Integer.MAX_VALUE;
        }
        else
        st.pop();
    }
    
    public int top() {
       return st.peek();
    }
    
    public int getMin() {
        return minS.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */