public class bubblesort {
    public static void bubblesort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                }

            }
            if (!flag) {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5 };
        bubblesort(arr);
    }
}