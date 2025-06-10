import java.util.Stack;
public class Stackq1 {
    public static void pushAtBottom(Stack<Integer>s , int x){
        if(!s.isEmpty()){
            int top = s.peek();
            s.pop();
            pushAtBottom(s,x);
            s.push(top);
        }else{
            s.push(x);


        }
    }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s,4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();    

        }
        
    }
}
