public class arraypairs {
    public static void pair(int arr[]){
        int tp = 0;
        for(int i = 0 ; i<=arr.length-1 ; i++){
            int curr = arr[i];
            for(int j = i+1 ; j<=arr.length-1 ; j++){
                System.out.print("("+ curr + ","+arr[j]+")");
                tp++;
            }
            System.out.println();
            

        }
        System.out.println("TOTAL PAIRS ARE "+tp);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        pair(arr);
    }
}
