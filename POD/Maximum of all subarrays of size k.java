class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<arr.length-(k-1);i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                max = Integer.max(max,arr[j]);
            }
            ans.add(max);
        }
        return ans;
    }
}
