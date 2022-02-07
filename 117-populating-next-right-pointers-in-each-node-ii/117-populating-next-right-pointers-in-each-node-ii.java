/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
        Node mainRoot = root;
        while(root != null){
                Node tempNode = new Node(-1);
                Node currNode = tempNode;
        
            while(root != null){
                if(root.left != null){
                 currNode.next = root.left;
                 currNode = currNode.next;
                }
            if(root.right != null){
                currNode.next = root.right;
                currNode = currNode.next;
             }
                root = root.next;
            }
        
        
        root = tempNode.next;
        
        }
        return mainRoot;
    }
}