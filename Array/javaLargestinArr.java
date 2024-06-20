public class javaLargestinArr {
    public static int LargestNum(int number[]){
        int largest = Integer.MIN_VALUE; // -infinity
        for(int i=0; i<number.length; i++){ // Changed `i<=number.length` to `i<number.length`
            if(largest<number[i]){
                largest=number[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int number[] = {1,2,6,3,5};
        System.out.println("largest value in arr is : "+LargestNum(number));
    }
}
