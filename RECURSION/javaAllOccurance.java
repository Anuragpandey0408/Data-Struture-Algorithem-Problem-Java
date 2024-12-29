public class javaAllOccurance {
    public static void allOccurance(int arr[], int target, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == target) {
            System.out.print(i + " ");
        }
        allOccurance(arr, target, i + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int target = 2;
        int i = 0;
        allOccurance(arr, target, i);
        System.out.println();
    }
}
