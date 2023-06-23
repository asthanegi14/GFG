class Solution {
    static int leastInterval(int N, int K, char tasks[]) {
        // code here
        int[] freq = new int[26];
        for(char c: tasks){
            freq[c-'A']++;
        }
        
        Arrays.sort(freq);
        
        int max = freq[25];
        int idl = (max-1)*K;
        
        for(int i=24;i>=0 && freq[i]>0;i--){
            idl -= Math.min(max-1, freq[i]);
        }
        
        idl = Math.max(0, idl);
        return N+idl;
    }
}
