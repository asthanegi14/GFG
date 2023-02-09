class Solution
{
    public boolean IsValid(int j, boolean[] vis, int[][] G, int[] assign){
        for(int i=0;i<G[0].length;i++){
            if(G[j][i]==1 && !vis[i]){
                vis[i] = true;
                
                if(assign[i]==-1 || IsValid(assign[i], vis, G, assign)){
                    assign[i]=j;
                    return true;
                }
            }
        }
        return false;
    }
    public int maximumMatch(int[][] G)
    {
        // Code here
        int m= G[0].length;
        int n = G.length;
        int count=0;
        
        
        int[] assign = new int[m];
        Arrays.fill(assign, -1);
        
        for(int i=0;i<n;i++){
            boolean[] vis = new boolean[m]; 
            if(IsValid(i, vis, G, assign)){
                count++;
            }
        }
        
        return count;
    }
}
