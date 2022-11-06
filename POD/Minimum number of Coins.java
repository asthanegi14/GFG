class Solution{
    static List<Integer> minPartition(int n)
    {
        // code here
        List<Integer> ans = new ArrayList<>();
        int[] r = {1,2,5,10,20,50,100,200,500,2000};
        for(int i=9;i>=0;i--){
            if(n>=r[i]){
                int div = n/r[i];
                for(int j=0;j<div;j++){
                    ans.add(r[i]);
                    n=n%r[i];
                }
            }
        }
        return ans;
    }
}
