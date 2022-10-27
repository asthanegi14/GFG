class Solution
{
    public int[] leafNodes(int arr[], int N)
    {
        // code here
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        // boolean t = false;
        for(int i=0,j=1;j<N;j++,i++){
            if(arr[i]>arr[j]){
                st.push(arr[i]);
            }
            else{
                while(!st.isEmpty()){
                    if(arr[j]>st.peek()){
                        st.pop();
                        // t=true;
                        if(!ans.contains(arr[i])){
                            ans.add(arr[i]);
                        }
                        // System.out.println(t);
                    }
                    else{
                        break;
                    }
                }
                // if(t){
                //     ans.add(arr[i]);
                // }
            }
        }
        ans.add(arr[N-1]);
        // System.out.println(ans);
        int ret[] = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            ret[i]=ans.get(i);
        }
        return ret;
    }
}
