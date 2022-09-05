/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        if(root == null)
            return res;
        
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        
        while( !q.isEmpty()){
            
            List<Integer> list = new ArrayList<>();
            int n = q.size();
            
            for(int i = 0 ; i < n; i++){
                
                Node node = q.poll();
                list.add(node.val);
                List<Node> childrens = node.children;
                
                for(Node child : childrens)
                    q.offer(child);
            }
            res.add(list);
        }
        return res;
        
    }
}