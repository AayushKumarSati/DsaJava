class MinStack {
    Stack<Integer> alldata;
    Stack<Integer> mindata;

    public MinStack() {
        alldata = new Stack<>();
        mindata = new Stack<>();
    }
   

    public void push(int val) {
        alldata.push(val);
        if (mindata.isEmpty() || val <= mindata.peek()) {
            mindata.push(val);
        }
    }

    public void pop() {
        if (alldata.isEmpty()) {
            return;
        } else {
            int val = alldata.pop();
            if (val == mindata.peek()) {
                mindata.pop();
            }
            
        }
    }

    public int top() {
        if (alldata.isEmpty()) {
            return -1;
        } else {

            return alldata.peek();
        }
    }

    public int getMin() {
        if (mindata.isEmpty()) {
            return -1;
        } else {
            return mindata.peek();
        }
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