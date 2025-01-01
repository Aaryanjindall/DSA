public class pairing {
    public static int pair(int x){
        if(x == 0 ){
            return 0;

        }
        if(x == 1 || x == 2){
            return x;
        }
        else{
            return pair(x-1) + (x-1)* (pair(x-2));
        }
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(pair(n));
    }
}
