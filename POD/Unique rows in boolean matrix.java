class GfG
{
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        //add code here.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        HashMap<ArrayList<Integer>, Integer> map = new HashMap<>();
        
        for(int i=0;i<r;i++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j=0;j<c;j++){
                arr.add(a[i][j]);
            }
            if(!map.containsKey(arr)){
                map.put(arr, 1);
                ans.add(arr);
            }
        }
        return ans;
    }
}
