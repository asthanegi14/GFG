class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high){
            int p = partition(arr, low, high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
        
        return;
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int p = arr[high];
        int j=low-1;
        
        for(int i=low;i<=high-1;i++){
            if(arr[i]<p){
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp; 
            }
        }
        int temp = arr[j+1];
        arr[j+1] = arr[high];
        arr[high] = temp; 
        
        return (j+1);
    } 
}
