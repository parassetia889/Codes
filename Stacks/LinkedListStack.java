import java.util.EmptyStackException;

public class LLStack {
    private ListNode top;
    private int length;

    class ListNode{
        private int data;
        private ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public LLStack(){
        top = null;
        length = 0;
    }

    public int getLength(){
        return length;
    }

    public boolean isEmpty(){
        return (length == 0);
    }

    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop(){
        if(isEmpty())
            throw new EmptyStackException();

        int result = top.data;
        top = top.next;
        length--;
        return result;
    }
    public int peek(){
        if(isEmpty())
            throw new EmptyStackException();
        return top.data;
    }
    public static void main(String[] args) {

        LLStack stack = new LLStack();
        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println(stack.getLength());
    }
}
