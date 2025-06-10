import java.util.*;
public class queuereversal {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.offer(st.pop());
        }
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        System.out.println();
    }
}
