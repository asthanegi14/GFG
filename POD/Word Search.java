class Solution
{
    public void dfs(int idx, int len, int i, int j, int n, int m, int[][] vis, char[][] b, String w, boolean[] bol, int[][] neg){
        if(idx==len){
            bol[0] = true;
            return;
        }
        if(bol[0]){
            return;
        }
        if(i==n || j==m){
            return;
        }
        
        if(w.charAt(idx) == b[i][j]){
            vis[i][j]=1;
            
            for(int[] x:neg){
                int a1 = i+x[0];
                int a2 = j+x[1];
                
                if(a1>=0 && a1<n && a2>=0 && a2<m && vis[a1][a2]==0){
                    dfs(idx+1, len, a1, a2, n, m, vis, b, w, bol, neg);
                }
            }
            vis[i][j]=0;
        }
        
    }
    public boolean isWordExist(char[][] b, String w)
    {
        // Code here
        int n = b.length;
        int m = b[0].length;
        int[][] vis = new int[n][m];
        boolean[] bol = new boolean[]{false};
        int[][] neg = {{1,0}, {0,1}, {-1,0}, {0,-1}};
        
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dfs(0, w.length(), i, j, n, m, vis, b, w, bol, neg);
                if(bol[0]==true){
                    return true;
                }
            }
        }
        return bol[0];
    }
}
