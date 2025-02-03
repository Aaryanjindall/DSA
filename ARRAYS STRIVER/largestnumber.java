import java.util.Scanner;

public class largestnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        for(int i = 0 ; i<10 ; i++){
            
            arr[i] = sc.nextInt();

        }
        int max = arr[0];
        for(int i =0 ; i<10 ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("max element is "+ max);
    }
}