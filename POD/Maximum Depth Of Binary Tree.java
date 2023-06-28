class Solution {
  public static int maxDepth(Node root) {
    // code here
    
    if(root==null){
        return 0;
    }
    int l = maxDepth(root.left);
    int r = maxDepth(root.right);
    
    return 1+Math.max(l,r);
  }
}
   
