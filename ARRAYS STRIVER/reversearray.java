public class reversearray {
    public static void reverse(int arr[]){
        int s = 0;
        int e = arr.length-1;
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;


        }
    }
    public static void main(String[] args) {
        int arrr[] = {1,2,3,4,5,6,7,8,9,10};
        reverse(arrr);
        for(int i = 0 ; i<arrr.length ; i++){
            System.out.print(arrr[i]+" ");
        }
    }
}
