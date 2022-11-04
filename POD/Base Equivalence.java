class Solution
{
    String baseEquiv(int n, int m)
    {
        // code here
        for(int i=2;i<=32;i++){
            if((int)(Math.log(n)/Math.log(i))+1==m){
                return "Yes";
            }
        }
        return "No";
    }
}
