//Tc : O(n*n*n)
class Solution{
    public int countTriplets(int[] nums){
        // code here
        if(nums.length<3){
            return 0;
        }
        int count=0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]<nums[j] && nums[j]<nums[k]){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}


//Tc : O(n*n)

class Solution{
    public int countTriplets(int[] nums){
        // code here
        if(nums.length<3){
            return 0;
        }
        int count=0;
        int i=1;
        while(i<nums.length-1){
            int j = 0;
            int k = i+1;
            int lar = 0, sml = 0;
            while(j<i){
                if(nums[j]<nums[i]){
                    sml++;
                }
                j++;
            }
            while(k<nums.length){
                if(nums[k]>nums[i]){
                    lar++;
                }
                k++;
            }
            i++;
            count+=sml*lar;
        }
        return count;
    }
}
