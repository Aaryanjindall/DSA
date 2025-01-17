import java.util.Scanner;

public class binarysearch {
    public static int binarysearch(int num[] , int key){
        int s = 0; 
        int e = num.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(num[mid] == key){
                return mid;
            }
            if(num[mid]>key){

                e = mid-1;

            }
            else{
                s = mid+1;
            }
            
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i = 0 ; i<10 ; i++){
            
            arr[i] = sc.nextInt();

        }
        System.out.println("ENTER ELEMENT TO SEARCH");
        int key = sc.nextInt();
        int result = binarysearch( arr , key);
        if(result == -1){
            System.out.println("ELEMENT NOT FOUND");

        }
        else{
            System.out.println("ELEMENT FOUND AT "+(result+1));
        }
    }
}
