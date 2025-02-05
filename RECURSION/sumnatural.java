public class sumnatural {
    public static int sum(int n){
        if(n == 0){
            return 0;

        }
        int summation = n + sum(n-1);
        return summation;
    

    }
    public static void main(String[] args) {
        int x = 10;
        int result = sum(x);
        System.out.println(result);
    }
}
