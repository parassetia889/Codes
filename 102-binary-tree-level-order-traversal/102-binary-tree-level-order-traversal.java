

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> al = new ArrayList<>();
        Queue<TreeNode> dq = new LinkedList<>();
        
        if(root == null)
            return al;
        
       
        dq.add(root);
        
        while( !dq.isEmpty() ){   //2
            
            List<Integer> list = new ArrayList<>();
            int n = dq.size();
            for(int i = 0; i<n; i++){
                
                TreeNode temp = dq.remove();
                list.add(temp.val);
                
                if(temp.left != null)
                    dq.add(temp.left);
                
                if(temp.right != null)
                    dq.add(temp.right);
            }
            al.add(list);
        } 
        
        return al;
    }
}