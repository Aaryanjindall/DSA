import java.util.HashMap;
import java.util.Scanner;

public class hashmaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input string
        System.out.println("Enter a string:");
        String s = sc.nextLine();

        // Initialize the HashMap
        HashMap<Character, Integer> hashMap = new HashMap<>();

        // Populate the HashMap with character frequencies
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        // Process queries
        System.out.println("Enter the number of queries:");
        int q = sc.nextInt();
        sc.nextLine(); // Consume the newline left after nextInt()
        
        System.out.println("Enter " + q + " characters to query:");
        while (q-- > 0) {
            char c = sc.nextLine().charAt(0); // Read the queried character
            System.out.println("Frequency of '" + c + "': " + hashMap.getOrDefault(c, 0));
        }

        sc.close();
    }
}
