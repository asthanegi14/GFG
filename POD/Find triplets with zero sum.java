class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int j=i+1, k=n-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum==0){
                    return true;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return false;
    }
}
