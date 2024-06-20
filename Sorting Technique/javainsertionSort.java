public class javainsertionSort {


    public static void insertionSort(int arr[]){
        for(int i=0; i<=arr.length-1; i++){
            int curr = arr[i];
            int prev = i-1;
            // find out the correct pos to insert
            while(prev >= 0 && arr[prev] > curr){
               arr[prev + 1] = arr[prev];
               prev--;
            }
            arr[prev + 1] = curr;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){ // Corrected loop condition
            System.out.print(arr[i] + " "); // Print elements on the same line
        }
        System.out.println(); // Move to next line after printing all elements
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
        printArr(arr);
    }
}
