import java.util.*;

public class printnum{
    public static void printdec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printdec(n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        printdec(x);

    }

}
