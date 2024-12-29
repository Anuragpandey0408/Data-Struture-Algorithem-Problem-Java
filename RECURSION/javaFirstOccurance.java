// find the first occurance of the target in the array
public class javaFirstOccurance {
    public static int firstOccurance(int arr[], int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return firstOccurance(arr, target, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 9, 5 };
        int target = 5;
        int i = 0;
        System.out.println(firstOccurance(arr, target, i));
    }
}