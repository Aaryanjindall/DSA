public class sumnatural {
    public static int sum(int n){
        if(n == 1){
            return 1;

        }
        int summation = n + sum(n-1);
        return summation;
    }
    public static void main(String[] args) {
        int x = 5;
        int result = sum(x);
        System.out.println(result);
    }
}
