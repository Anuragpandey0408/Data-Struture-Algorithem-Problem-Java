public class javaMaxSubArrSum {
    public static void printSubarrSum(int number[]) {

        int currSum = 0;

        int maxSum = Integer.MIN_VALUE; // -infinity

        for (int i = 0; i < number.length; i++) { // start

            int start = i;

            for (int j = i; j < number.length; j++) { // end

                int end = j;

                currSum = 0;

                for (int k = start; k <= end; k++) {

                    // subarray Sum
                    currSum += number[k];

                }

                System.out.println(currSum);

                if (maxSum < currSum) {

                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("maxSum is :" + maxSum);
    }

    public static void main(String[] args) {

        int number[] = { 2, 4, 6, 8, 10 };

        printSubarrSum(number);
    }
}
