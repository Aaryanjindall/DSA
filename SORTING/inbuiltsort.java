import java.util.*;


public class inbuiltsort {
    public static void main(String[] args) {
        Integer arr[] = {5, 4, 1, 3, 2};
        // Arrays.sort(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        // Arrays.sort(arr,0,3);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }



    }
}
