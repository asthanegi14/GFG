
//User function Template for Java

class Solution
{
    public ArrayList<ArrayList<Integer>> UniquePartitions(int n)
    {
        // Code here
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        ArrayList<Integer> addIt = new ArrayList<>();
        find(n,ret,addIt);
        
        return ret;
    }
    public void find(int n, ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> addIt){
        if(n<=0){
            if(n==0){
                ret.add((ArrayList)addIt.clone());
            }
            return;
        }
        
        int x=n;
        
        if(addIt.size()>0){
            x = addIt.get(addIt.size()-1);
        }
        
        for(int i=x;i>=1;i--){
            addIt.add(i);
            find(n-i,ret,addIt);
            addIt.remove(addIt.size()-1);
        }
    }
}
