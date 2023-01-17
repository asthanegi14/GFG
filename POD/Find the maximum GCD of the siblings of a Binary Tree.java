class Solution {
    int gcd(int l , int r){
        if(l==0){
            return r;
        }
        return gcd(r%l,l);
    }
    
    int ans=0,gcdVal=0;
    
    int maxGCD(Node root) {
        // code here 
        if(root==null){
            return gcdVal;
        }
        
        if(root.left!=null && root.right!=null){
            int val = gcd(root.left.data, root.right.data);
            if(gcdVal<val){
                // System.out.println("gcdVal is greater than or equals to "+gcd(root.left, root.right));
                gcdVal = val;
                ans = root.data;
            }
            else if(gcdVal==val){
                ans = Math.max(ans, root.data);
            }
            // System.out.println("gcd = "+gcdVal+" ans = "+ans+" left = "+root.left.data+" right = "+root.right.data);
        }
        
        maxGCD(root.left);
        maxGCD(root.right);
        return ans;
    }
}
