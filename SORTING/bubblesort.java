public class bubblesort{
    public static void bubblesort(int arr[]){
        for(int turn = 0 ; turn<arr.length -1 ; turn++){
            for(int j = 0 ; j<arr.length-1-turn ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }
        for(int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i]+" ");

        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        bubblesort(arr);
    }
}