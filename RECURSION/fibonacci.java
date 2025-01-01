public class fibonacci {
    public static int fibo(int x){
        if(x == 0 || x == 1){
            return x;
        }
        int fib = fibo(x-1) + fibo(x-2);
        return fib;
    }
    public static void main(String[] args) {
        int x = 25;
        int result = fibo(x);
        System.out.println(result);
    }
}

