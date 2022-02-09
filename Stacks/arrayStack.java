
import java.util.*;
import java.io.*;
public class arrayStack {
    int size;
    int[] arr;
    int top ;

    arrayStack(int size){
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    //insertion
    void push(int x) {
       if(size - top > 1){
           top++;
           arr[top] = x;
       }
       else
           System.out.println("Overflow");
      }
        void pop(){
            if(top >=0)
                System.out.println(arr[top--]);
            else
                System.out.println("Stack Empty");
        }

        void peek(){
        if(isEmpty()) {
            System.out.println("Stack empty");
            return ;}
        else
            System.out.println(arr[top]);
        }

        public boolean isEmpty(){
        return top == -1;
        }

        public boolean isFull(){
        return (top == size-1);
        }

    public static void main(String[] args) {
        arrayStack stack = new arrayStack(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(1);
        stack.pop();
        stack.peek();
    }
}
