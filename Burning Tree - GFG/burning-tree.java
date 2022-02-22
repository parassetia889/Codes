// { Driver Code Starts
//Initial Template for Java


import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class GfG {

	static Node buildTree(String str) {

		if (str.length() == 0 || str.charAt(0) == 'N') {
			return null;
		}

		String ip[] = str.split(" ");
		// Create the root of the tree
		Node root = new Node(Integer.parseInt(ip[0]));
		// Push the root to the queue

		Queue<Node> queue = new LinkedList<>();

		queue.add(root);
		// Starting from the second element

		int i = 1;
		while (queue.size() > 0 && i < ip.length) {

			// Get and remove the front of the queue
			Node currNode = queue.peek();
			queue.remove();

			// Get the current node's value from the string
			String currVal = ip[i];

			// If the left child is not null
			if (!currVal.equals("N")) {

				// Create the left child for the current node
				currNode.left = new Node(Integer.parseInt(currVal));
				// Push it to the queue
				queue.add(currNode.left);
			}

			// For the right child
			i++;
			if (i >= ip.length)
				break;

			currVal = ip[i];

			// If the right child is not null
			if (!currVal.equals("N")) {

				// Create the right child for the current node
				currNode.right = new Node(Integer.parseInt(currVal));

				// Push it to the queue
				queue.add(currNode.right);
			}
			i++;
		}

		return root;
	}

	static void printInorder(Node root) {
		if (root == null)
			return;

		printInorder(root.left);
		System.out.print(root.data + " ");

		printInorder(root.right);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t > 0) {
			String s = br.readLine();
			int target = Integer.parseInt(br.readLine());
			Node root = buildTree(s);

			Solution g = new Solution();
			System.out.println(g.minTime(root, target));
			t--;

		}
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    
    
    static Map<Node, Node> nodeToParent = new HashMap<>();
    
    //creates mapping 
    //return target
    static Node createParentMapping(Node root, int target ){
        
        
        Node res = null;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        nodeToParent.put(root, null);
        
        while( !q.isEmpty()){
            
            Node front = q.poll();
            if(front.data == target)
                res = front;
                
            if(front.left != null){
                nodeToParent.put(front.left, front);
                q.add(front.left);
            }
                
            if(front.right != null){
                nodeToParent.put(front.right, front);
                q.add(front.right);
            }
            
        }
        
        return res;
    }
    
    static int burnTree(Node root){
        
        Map<Node, Integer> visited = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        visited.put(root, 1);
        
        //level order
        int ans = 0;
        
        while( !q.isEmpty()){
            
            boolean flag = false;
            int size = q.size();
            for(int i = 0; i<size; i++){
                Node front = q.poll();
                
            if(front.left !=null && !visited.containsKey(front.left)){
                flag = true;
                q.add(front.left);
                visited.put(front.left, 1);
                
            }
                
        
            if(front.right != null && !visited.containsKey(front.right)){
                flag = true;
                q.add(front.right);
                visited.put(front.right, 1);
            }
            
         if(nodeToParent.containsKey(front) && !visited.containsKey(nodeToParent.get(front))){
                 if(nodeToParent.get(front) != null){flag = true;
                 q.add(nodeToParent.get(front));
                 visited.put(nodeToParent.get(front),1);}
             }
                
            }
            if(flag == true)
                ans++;
                
        }
        return ans;
    }
    public static int minTime(Node root, int target) 
    {
        // Your code goes here
        //step1:create parent mapping
        //step2: find target node
        //step3: burn the tree in min time
        int ans = 0;
       
        Node t = createParentMapping(root, target);
        
        return burnTree(t);
    }
}