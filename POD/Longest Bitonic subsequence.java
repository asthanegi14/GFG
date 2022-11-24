class Solution
{
    public int LongestBitonicSequence(int[] nums)
    {
        // Code here
        int[] f = new int[nums.length];
        int[] l = new int[nums.length];
        
        Arrays.fill(f,1);
        Arrays.fill(l,1);
        
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i] && f[i]<1+f[j]){
                    f[i] = 1+f[j];
                }
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            for(int j=nums.length-1;j>i;j--){
                if(nums[j]<nums[i] && l[i]<1+l[j]){
                    l[i] = 1+l[j];
                }
            }
        }
        
        int r = 0;
        for(int i=0;i<nums.length;i++){
            r = Math.max(r,f[i]+l[i]-1);
        }
        return r;
    }
}
