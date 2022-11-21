
/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;
    
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static boolean areAnagrams(Node node1, Node node2) {
        // code here
        if(node1.data != node2.data){
            return false;
        }
        
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();
        
        q1.add(node1);
        q2.add(node2);
        
        while(!q1.isEmpty() && !q2.isEmpty()){
            int s1 = q1.size(), s2 = q2.size();
            if(s1!=s2){
                return false;
            }
            Map<Integer, Integer> m = new HashMap<>();
            for(int i=0;i<s1;i++){
                Node a = q1.poll();
                Node b = q2.poll();
                m.put(a.data,m.getOrDefault(a.data,0)+1);
                m.put(b.data,m.getOrDefault(b.data,0)-1);
                
                if(a.left!=null){
                    q1.add(a.left);
                }
                if(b.left!=null){
                    q2.add(b.left);
                }
                if(a.right!=null){
                    q1.add(a.right);
                }
                if(b.right!=null){
                    q2.add(b.right);
                }
            }
            for(int k: m.keySet()){
                if(m.get(k)!=0){
                    return false;
                }
            }
        }
        return true;
    }
}
        
