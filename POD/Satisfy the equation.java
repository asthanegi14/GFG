class Pair{
    int a,b;
    Pair(int a, int b){
        this.a=a;
        this.b=b;
    }
}
class Solution {
     
    static int[] satisfyEqn(int[] A, int N) {
        // code here
        HashMap<Integer,Pair> map = new HashMap<>();
        int max[]={1000,1000,1000,1000};
        for(int i=0;i<A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                int sum=A[i]+A[j];
                if(!map.containsKey(sum)){
                    map.put(sum,new Pair(i,j));
                }
                else if(map.containsKey(sum)){
                    int[] ans = new int[4];
                    Pair p = map.get(sum);
                    
                    if(p.a!=i && p.b!=j && p.a!=j && p.b!=i){
                        ans[0]=p.a;
                        ans[1]=p.b;
                        ans[2]=i;
                        ans[3]=j;
                        for(int k=0;k<4;k++){
                            if(ans[k]<max[k]){
                                max=ans;
                                break;
                            }
                            else if(max[k]<ans[k])break;
                        }
                    }
                }
            }
        }
        if(max[0]==1000){
            int[] ret = {-1,-1,-1,-1};
            return ret;
        }
        return max;
    }
};
