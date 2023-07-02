class Solution{
    static int setSetBit(int x, int y, int l, int r){
        // code here
        int a = (((1<<r-l+1)-1)<<(l-1));
        
        y = y&a;
        return x|y;
    }
}
