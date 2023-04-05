class Solution {
    public boolean isPossible(HashMap<Integer, Integer> map, int n){
        for(int i=1;i<n;i++){
            if(n%i==0 && map.containsKey(i)){
                return true;
            }
        }
        return false;
    }
    public int countSpecialNumbers(int N, int arr[]) {
        // Code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int count=0;
        
        for(int i:arr){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]) && map.get(arr[i])>1 || isPossible(map, arr[i])){
                count++;
            }
        }
        return count;
    }
}
