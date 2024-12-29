public class javaLastOccurance {
    public static int lastOccurance(int arr[], int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurance(arr, target, i + 1);
        if (isFound == -1 && arr[i] == target) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 5, 5, 5, 5, 5, 5, 5, 6 };
        int target = 5;
        int i = 0;
        System.out.println(lastOccurance(arr, target, i));
    }
}
