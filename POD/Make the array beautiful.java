class Solution {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.isEmpty()){
                st.push(arr[i]);
            }
            else if((arr[i]>=0 && st.peek()>=0) || (arr[i]<0 && st.peek()<0)){
                st.push(arr[i]);
            }
            else{
                st.pop();
            }
        }
        
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        Collections.reverse(ans);
        return ans;
    }
}
