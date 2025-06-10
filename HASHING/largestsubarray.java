import java.util.HashMap;

public class largestsubarray {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int length = 0;

        int arr[] = {15, -2, 2, -8, 1, 7, 10};

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Check if sum is 0, update length
            if (sum == 0) {
                length = i + 1;
            }

            // If sum is already in the map, calculate the length
            if (map.containsKey(sum)) {
                length = Math.max(length, i - map.get(sum));
            } else {
                // Store this sum with its index
                map.put(sum, i);
            }
        }
        System.out.println("Length of the largest subarray with sum 0 is: " + length);
    }
}
