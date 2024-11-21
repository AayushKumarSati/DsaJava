class MyQueue {
    private Stack<Integer> main;// create main stack
    private Stack<Integer> helper;// create helper stack

    public MyQueue() {
        main = new Stack<>();
        helper = new Stack<>();
    }

    public void push(int x) {
        //moving all elements from main stack to helper stack:main-->helper
        while(main.size()>0){
            helper.push(main.pop());
        }
        //add the element(x) in the mainstack 
        main.push(x);
        //moving all elements from helper stack to main stack:helper-->main
        while(helper.size()>0){
            main.push(helper.pop());
        }
    }

    public int pop() {
        return main.pop();
    }

    public int peek() {
        return main.peek();

    }

    public boolean empty() {
        return main.size()==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */