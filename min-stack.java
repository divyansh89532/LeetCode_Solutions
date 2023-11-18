class MinStack {
    
    Stack <Integer> min_stack = new Stack<Integer>();
    public MinStack() {
    }
    
    public void push(int val) {
        min_stack.push(val);
    }
    
    public void pop() {
        min_stack.pop();
    }
    
    public int top() {
        return (min_stack.peek());
    }
    
    public int getMin() {
        int min = min_stack.peek();
        for(int i:min_stack)
        {
            if(i<min)
            {
                min = i;
            }
        }
        return min;
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
