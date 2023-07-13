
class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> a = new HashSet<>();
        
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        // System.out.println(map);
        
        for(int key : map.keySet()){
            // System.out.println("key = "+key);
            if(a.contains(map.get(key))){
                return false;
            }
            else
            a.add(map.get(key));
        }
        return true;
    }
}
