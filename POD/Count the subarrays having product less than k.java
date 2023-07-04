class Solution {
    
    public int countSubArrayProductLessThanK(long a[], int n, long k)
    {
        int i=0, j=0;
        int ans=0;
        long temp = 1;
        
        while(i<n && j<n){
            temp *= a[j];
            
            while(temp>=k && i<j){
                temp/=a[i];
                i++;
            }
            
            if(temp<k){
                ans+=j-i+1;
            }
            j++;
        }
        return ans;
    }
}
