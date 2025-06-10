import java.util.Stack;

public class Stackq4 {
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nextgreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) { // Fixed loop condition
            // Pop smaller elements
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // Assign next greater element
            if (s.isEmpty()) {
                nextgreater[i] = -1;
            } else {
                nextgreater[i] = arr[s.peek()];
            }

            // Push current index
            s.push(i);
        }

        // Print results
        for (int i = 0; i < nextgreater.length; i++) {
            System.out.println(nextgreater[i]);
        }
    }
}
