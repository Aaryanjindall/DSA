public class subarrays {
    public static void subarray(int arr[]){
        int ts = 0;
        for(int i = 0 ; i<arr.length ; i++){
            int start = i;
            
            for(int j = i ; j<arr.length ; j++){
                int e = j;
                for(int k= start ; k<=e ; k++){
                    System.out.print(arr[k]+" ");
                    
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total number of subarrays are"+ts);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        subarray(arr);
    }
}
