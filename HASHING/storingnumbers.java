import java.util.Scanner;

public class storingnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        // Initialize the array
        int arr[] = new int[n];

        // Populate the array
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create a hash array (assuming values are in the range 0 to 12)
        int hash[] = new int[13]; // Fixed size of 13 for hash array
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0 && arr[i] < 13) { // Check to avoid out-of-bounds error
                hash[arr[i]] += 1;
            }
        }

        // Process queries
        System.out.println("Enter the number of queries:");
        int q = sc.nextInt();
        System.out.println("Enter " + q + " numbers to query:");
        while (q-- > 0) {
            int number = sc.nextInt();
            if (number >= 0 && number < 13) { // Check to avoid out-of-bounds error
                System.out.println("Frequency of " + number + ": " + hash[number]);
            } else {
                System.out.println("Number out of range (0-12).");
            }
        }

        sc.close();
    }
}
