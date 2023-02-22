class Solution {
    public void connect(Node root) {
        // code here
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            Node pre = null;
            for(int i=1;i<=size;i++){
                Node curr = q.poll();
            
                curr.nextRight = pre;
                
                if(curr.right!=null){
                    q.add(curr.right);
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                pre = curr;
            }
        }
    }
}
