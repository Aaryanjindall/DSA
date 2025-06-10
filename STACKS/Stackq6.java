import java.util.Stack;
public class Stackq6 {
    public static void stockspan(int stocks[] , int n , int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for(int i = 1 ; i<stocks.length ; i++){
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice > stocks[s.peek()]){
                s.pop();
            } 
            if(s.isEmpty()){
                span[i] = i+1;
            }
            else{
                span[i] = i - s.peek(); 



            }
            s.push(i);
        }


    }
    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int n = stocks.length;
        int[]span = new int[n];
        
        stockspan(stocks, n, span);
        for(int i = 0 ; i<n ; i++){
            System.out.println(span[i]+" ");
        }
    }
}
