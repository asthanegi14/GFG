class Solution
{
    public boolean isValid(int[] a, int k){
        int max=0,sum=0;
        for(int i: a){
            sum+=i;
            max=Math.max(max,i);
        }
        sum-=max;
        if(sum<=k){
            return true;
        }
        return false;
    }
    public int characterReplacement(String s, int k)
    {
        // code here
        int i=0,j=0,max=0;
        int[] arr = new int[26];
        while(j<s.length()){
            if(isValid(arr,k)){
                max = Math.max(max,j-i);
                arr[s.charAt(j)-'A']++;
                j++;
            }
            else{
                arr[s.charAt(i)-'A']--;
                i++;
            }
        }
        while(i<s.length()){
            if(isValid(arr,k)){
                max = Math.max(max,j-i);
                break;
            }
            else{
                arr[s.charAt(i)-'A']--;
                i++;
            }
        }
        return max;
    }
}
