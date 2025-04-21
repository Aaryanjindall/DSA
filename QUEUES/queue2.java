import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;

public class queue2 {
    public static void main(String[] args) {
        
        // Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q1 = new ArrayDeque<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();

        }
    }
}
