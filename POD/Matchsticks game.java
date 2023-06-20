class Solution {
    static int matchGame(Long N) {
        // code here
        int res = (int)(N%5);
        return res==0?-1:res;
    }
};
