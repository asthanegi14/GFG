class Solution
{
    public int[] twoOddNum(int Arr[], int N)
    {
        // code here
        int[] ret = new int[2];
        
        Arrays.sort(Arr);
        int j=1;
        for(int i=0;i<N;i++){
            int count=1;
            while((i+1)<N && Arr[i]==Arr[i+1]){
                count++;
                i++;
            }
            if(count%2!=0){
                ret[j]=Arr[i];
                j--;
            }
        }
        return ret;
    }
}
