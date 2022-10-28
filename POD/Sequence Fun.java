class Solution
{
    public int NthTerm(int n)
    {
        // code here
        long x=2;
        if(n==1){return 2;}
        else{
            int i=2;
            while(i<=n){
                x = ((x*i)+1)%1000000007;
                i++;
            }
        }
        return (int)x;
    }
}
