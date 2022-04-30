class MinStack {

    class Node{
        int data;
        int min; 
        Node next;
        Node(int data, int min){
            this.data = data;
            this.next = null;
            this.min = min;
        }
    }
    
    Node top;
    public MinStack() {
        top = null;
    }
    
    public void push(int val) {
        if(top == null){
            top = new Node(val, val);
        }
        else{
            Node node = new Node(val, Math.min(val, top.min));
            node.next = top;
            top = node;
        }
    }
    
    public void pop() {
        top = top.next;
    }
    
    public int top() {
        return  top.data;
    }
    
    public int getMin() {
        return top.min;
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