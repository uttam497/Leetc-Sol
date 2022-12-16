class MyQueue {

   Stack<Integer> s1 = new Stack<>();
Stack<Integer> s2 = new Stack<>();
static int front = 0;

public MyQueue() {
}

public void push(int x) {
    
    if(s1.isEmpty())
        front = x;
    s1.push(x);
}

public int pop() {
    
    if(s2.isEmpty()){
        
        while(! s1.isEmpty())
            s2.push(s1.pop());
    }
    
    int ans = s2.pop();
    
    while(!s2.isEmpty()){
        
        if(s1.isEmpty())
            front = s2.peek();
        s1.push(s2.pop());
    }
    return ans;
}

public int peek() {
    if(!s2.isEmpty())
        return s2.peek();
    
    return front;
}

public boolean empty() {
    return s1.isEmpty() && s2.isEmpty();
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