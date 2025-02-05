public class insertionsort {
    public static void insertionsort(int arr[]) {
        // Iterate over the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i]; // Store the current element
            int prev = i - 1; // Index of the previous element

            // Move elements of the sorted subarray that are greater than the current element
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // Place the current element in its correct position
            arr[prev + 1] = curr;
        }

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        insertionsort(arr);
    }
}
