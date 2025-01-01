import java.util.Scanner;

public class printincnum {
     public static void printinc(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        printinc(n-1);
        System.out.println(n);
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        printinc(x);

    }
}
