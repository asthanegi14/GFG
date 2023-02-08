class Solution {
    long[] countZero(int n, int k, int[][] arr){
        // code here
        
        int r=n, c=n;
        long count=n*n;
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();
        
        long[] answer = new long[k];
        
        for(int i=0;i<k;i++){
            int r2 = arr[i][0];
            int c2 = arr[i][1];
            
            if(!row.contains(r2) && !col.contains(c2)){
                count=count-r-c+1;
                r--;
                c--;
            }
            
            if(row.contains(r2) && !col.contains(c2)){
                count=count-r;
                c--;
            }
            
            if(!row.contains(r2) && col.contains(c2)){
                count=count-c;
                r--;
            }
            
            
            answer[i] = count;
            row.add(r2); col.add(c2);
        }
        return answer;
    }
}
