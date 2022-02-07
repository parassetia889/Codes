// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the curr node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the curr node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the curr node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            
            Solution T = new Solution();
            System.out.println(T.largestBst(root));
            
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }


class Solution{
    
    class Nodepair{
        int size;
        int min;
        int max;
    }
   
   Nodepair getSize(Node node){
       if(node==null){
           Nodepair bp=new Nodepair();
           bp.size=0;
           bp.min=Integer.MAX_VALUE;
           bp.max=Integer.MIN_VALUE;
           return bp;
       }
      
       Nodepair np=new Nodepair();
       Nodepair lp=getSize(node.left);
       Nodepair rp= getSize(node.right);
       
     
       if(lp.max<node.data && node.data<rp.min){
           np.size=lp.size+rp.size+1;
           np.min=Math.min(node.data,Math.min(lp.min,rp.min));
           np.max=Math.max(node.data,Math.max(lp.max,rp.max));
       }else{
           np.size=Math.max(lp.size,rp.size);
           np.min=Integer.MIN_VALUE;
           np.max=Integer.MAX_VALUE;
       }
       
       return np;
   }

    int largestBst(Node root){
    
       Nodepair cp=getSize(root);
        return cp.size;
    }
    
}