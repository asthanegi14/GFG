class Solution
{
    public int[] reverseSpiral(int r, int c, int[][] a)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0,j=0;
        int er=r-1, ec=c-1;
        
        while(i<=er && j<=ec){
            for(int x=j;x<=ec;x++){
                ans.add(a[i][x]);
            }
            for(int x=i+1;x<=er;x++){
                ans.add(a[x][ec]);
            }
            for(int x=ec-1;x>=j;x--){
                if(i==er){break;}
                ans.add(a[er][x]);
            }
            for(int x=er-1;x>=i+1;x--){
                if(i==ec){break;}
                ans.add(a[x][j]);
            }
            i++;
            j++;
            ec--;
            er--;
        }
        Collections.reverse(ans);
        int[] ret = new int[ans.size()];
        for(int k=0;k<ans.size();k++){
            ret[k]=ans.get(k);
        }
        return ret;
    }
}
