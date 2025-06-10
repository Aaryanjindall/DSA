public class quicksort {
    public static void quicksort(int arr[],int si , int ei){
        if(si>=ei){
            return;
        }
        int pivot = partition(arr,si,ei);
        quicksort(arr, si, pivot-1);
        quicksort(arr, pivot+1, ei);
        

    } 
    private static void 
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        quicksort(arr, 0, arr.length-1);
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
