public class javaSelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // Corrected loop range
            int min_inndex = i;  // i = turn
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min_inndex] > arr[j]) {
                    min_inndex = j; // Update min_inndex correctly
                }
            }
            // Swap
            int temp = arr[min_inndex];
            arr[min_inndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // Corrected loop condition
            System.out.print(arr[i] + " "); // Print elements on the same line
        }
        System.out.println(); // Move to next line after printing all elements
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        selectionSort(arr);
        printArr(arr);
    }
}

