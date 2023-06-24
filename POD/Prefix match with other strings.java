class Solution
{
    public int klengthpref(String[] arr, int n, int k, String str)
    {
        // code here
        int ans=0;
        if(k>str.length()){
            return 0;
        }
        for(int i=0;i<n;i++){
            if(arr[i].length()>=k && arr[i].substring(0,k).equals(str.substring(0,k))){
                ans++;
            }
        }
        return ans;
    }
}
