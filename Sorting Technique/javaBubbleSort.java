public class javaBubbleSort {

    public static void bubbleSort(int arr[]){
        int swapCount = 0;
        for(int turn=0; turn<=arr.length-2; turn++){
            for(int j=0; j<=arr.length-2-turn; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapCount++;
                }
            }
        }
        System.out.println("Total number of swaps: " + swapCount);
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){ // Corrected loop condition
            System.out.print(arr[i] + " "); // Print elements on the same line
        }
        System.out.println(); // Move to next line after printing all elements
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr);
        printArr(arr);
    }
}

