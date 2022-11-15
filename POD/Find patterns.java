class Solution{
    static int numberOfSubsequences(String S, String W){
        // code here
        int i=0,count=0;
        boolean[] ans = new boolean[S.length()];
        Arrays.fill(ans,false);
        
        while(i<S.length()){
            int j=i+1;
            if(S.charAt(i)==W.charAt(0) && ans[i]==false){
                ans[i]=true;
                int k=1;
                while(j<S.length()){
                    if(k<W.length() && S.charAt(j)==W.charAt(k) && ans[j]==false){
                        ans[j]=true;
                        k++;
                    }
                    j++;
                }
                if(k==W.length()){
                    count++;
                }
            }
            i++;
        }
        return count;
    }
}
