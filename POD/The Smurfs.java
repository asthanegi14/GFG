class Solution{
    static int minFind(int n, String a[]){
        // code here
        
        //BruteForce
        
        
        // ArrayList<String> arr = new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     arr.add(a[i]);
        // }
        // int k=0;
        // while(k<n){
        //         for(int i=0;i<arr.size();i++){
        //         for(int j=0;j<arr.size();j++){
        //             if(i!=j && !(arr.get(i).equals(arr.get(j)))){
        //                 if(arr.get(i).equals("R") && arr.get(j).equals("B")){
        //                     arr.add("G");
        //                     arr.remove(arr.get(i));
        //                     arr.remove(arr.get(j));
        //                 }
        //                 else if(arr.get(i).equals("R") && arr.get(j).equals("G")){
        //                     arr.add("B");
        //                     arr.remove(arr.get(i));
        //                     arr.remove(arr.get(j));
        //                 }
        //                 else if(arr.get(i).equals("G") && arr.get(j).equals("B")){
        //                     arr.add("R");
        //                     arr.remove(arr.get(i));
        //                     arr.remove(arr.get(j));
        //                 }
        //                 else if(arr.get(i).equals("G") && arr.get(j).equals("R")){
        //                     arr.add("B");
        //                     arr.remove(arr.get(i));
        //                     arr.remove(arr.get(j));
        //                 }
        //                 else if(arr.get(i).equals("B") && arr.get(j).equals("R")){
        //                     arr.add("G");
        //                     arr.remove(arr.get(i));
        //                     arr.remove(arr.get(j));
        //                 }
        //                 else if(arr.get(i).equals("B") && arr.get(j).equals("G")){
        //                     arr.add("R");
        //                     arr.remove(arr.get(i));
        //                     arr.remove(arr.get(j));
        //                 }
        //             }
        //         }
        //     }
        // }
        // if(!arr.get(0).equals(arr.get(1))){
        //     return arr.size()-1;
        // }
        // // System.out.println(arr);
        // return arr.size();
        
        //Optimal Solution
        int r=0,b=0,g=0;
        
        for(int i=0;i<n;i++){
            if(a[i].equals("R")){
                r++;
            }
            if(a[i].equals("G")){
                g++;
            }
            if(a[i].equals("B")){
                b++;
            }
        }
        if((r%2==0 && b%2==0 && g%2==0) || (r%2!=0 && b%2!=0 && g%2!=0)){
            return 2;
        }
        else if((r==0 && b==0) || (r==0 && g==0) || (g==0 && b==0)){
            return n;
        }
        else return 1;
    }
}
