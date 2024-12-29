package Backtracking;

public class javaArrayBacktrack {

    public static void changeArr(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }

        // recusion
        // initilize array i=0 --> 1, i=1 --> 2......
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        // initilized array -2 from last
        arr[i] = arr[i] - 2;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
