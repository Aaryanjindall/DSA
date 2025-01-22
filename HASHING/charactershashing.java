import java.util.Scanner;

public class charactershashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input string
        System.out.println("Enter a string:");
        String s = sc.nextLine();

        // Initialize the hash array (size 256 for all ASCII characters)
        int hash[] = new int[256];

        // Populate the hash array with character frequencies
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }

        // Process queries
        System.out.println("Enter the number of queries:");
        int q = sc.nextInt();
        sc.nextLine(); // Consume the newline left after nextInt()
        
        System.out.println("Enter " + q + " characters to query:");
        while (q-- > 0) {
            char c = sc.nextLine().charAt(0); // Read the queried character
            System.out.println("Frequency of '" + c + "': " + hash[c]);
        }

        sc.close();
    }
}
