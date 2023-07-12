class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> x = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                x.add(arr[i]);
            }
            else{
                map.put(arr[i], i+1);
            }
        }
        
        // System.out.println(x);
        for(int i=0;i<n;i++){
            if(x.contains(arr[i])){
                return i+1;
            }
        }
        return -1;
    }
}
