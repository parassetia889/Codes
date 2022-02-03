// { Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}
// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    
    static Node reverse(Node head)
    {
        Node prevNode=null,curr=head,nextNode=null;
        if(head==null)
        return null;
        
        else if(head.next==null)
            return head;
            
        else
        {
            while(curr!=null)
            {
                    nextNode=curr.next;
                    curr.next=prevNode;
                    prevNode=curr;
                    curr=nextNode;
                
                
            }
            head=prevNode;
            return head;
        }
            
        
    }
    
    static Node addTwoLists(Node first, Node second)
    {
        Node temp1=first,temp2=second;
        temp1=reverse(temp1);
        temp2=reverse(temp2);
        int carry=0;
        Node t=null;
        
        while(temp1!=null && temp2!=null)
        {
            Node nextN=new Node(-1);
            nextN.next=t;
            nextN.data=(carry+temp1.data + temp2.data)%10; //getting the units digit
            //calculating carry for the next iteration
            if(temp1.data+ temp2.data + carry >=10)
                carry=1;
            else
                carry=0;
               
             t=nextN; 
            
            
            temp1=temp1.next;
            temp2=temp2.next;
            
            
        }
        
        while(temp1!=null)//if length of num1 is greater
        {
            Node nextN=new Node(-1);
            nextN.next=t;
            
            nextN.data=(carry+temp1.data)%10;
            if(carry+temp1.data >=10)
                carry=1;
              
            else 
                carry=0;
                
            t=nextN;
            temp1=temp1.next;
            
        }
        
        while(temp2!=null)//if length of num2 is greater
        {
            Node nextN=new Node(-1);
             nextN.next=t;
            
            nextN.data=(carry+temp2.data)%10;
            if(carry+temp2.data >=10)
                carry=1;
            
            else
                carry=0;
                
            t=nextN;
            temp2=temp2.next;
            
        }
        //if the addition of the last pair of digits is >10,i.e number of digits in answer is increased by 1.
        //eg)99+11 = 110 
        if(carry==1) 
        {
            Node n=new Node(1);
            n.next=t;
            t=n;
        }
        
        return t;
        
        
    }
}