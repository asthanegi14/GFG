class alphanumeric implements Comparable<alphanumeric> {
    public String name;
    public int count;
    alphanumeric(String name, int count) {
        this.name = name;
        this.count = count;
    }
    public int compareTo(alphanumeric a){
        return this.name.compareTo(a.name);
    }
};
class Solution {
    alphanumeric[] sortedStrings(int N, String A[]) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            map.put(A[i],map.getOrDefault(A[i],0)+1);
        }
        alphanumeric ans[] = new alphanumeric[map.size()];
        
        int i=0;
        for(Map.Entry<String,Integer> m: map.entrySet()){
            ans[i]=new alphanumeric(m.getKey(),m.getValue());
            i++;
        }
        Arrays.sort(ans);
        return ans;
    }
};
