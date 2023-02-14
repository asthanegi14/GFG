class Solution{
	int minCost(int [][] colors, int N){
        //Write your code here
        
        int p=0, b=0, y=0;
        for(int i=0;i<N;i++){
            int cP = Math.min(b,y)+colors[i][0];
            int cB = Math.min(p,y)+colors[i][1];
            int cY = Math.min(b,p)+colors[i][2];
            
            p=cP;
            b=cB;
            y=cY;
            
        }
        return Math.min(p,Math.min(b,y));
    }
}
