class Solution {
    public int[] findMaxRow(int mat[][], int N) {
        // code here
        int[] ans = new int[2];
        int row = 0, count = 0, j=N-1;
        for(int i=0;i<N;i++){
            if(N-j-1<count){
                break;
            }
            
            while(j>=0 && mat[i][j]==1){
                j--;
            }
            
            if(N-j-1 > count){
                row=i;
                count=N-j-1;
            }
        }
        
        ans[0]=row;
        ans[1]=count;
        return ans;
    }
};
