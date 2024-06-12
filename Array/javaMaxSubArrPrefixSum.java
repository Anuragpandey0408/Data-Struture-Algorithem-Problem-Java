public class javaMaxSubArrPrefixSum {
    public static void printSubArrPrefixSum(int number[]) {

        int currSum = 0;

        int maxSum = Integer.MIN_VALUE; // -infinity

        int prefix[] = new int[number.length]; // number.length = n

        prefix[0] = number[0];
        
        // Calculate prefix array
        for (int i = 1; i < number.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }

        for (int i = 0; i < number.length; i++) { // start

            int start = i;

            for (int j = i; j < number.length; j++) { // end

                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                // Uncomment the next line if you want to print the current sum for each subarray
                // System.out.println(currSum);

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
            // Uncomment the next line if you want to print a new line after each start index
            // System.out.println();
        }
        System.out.println("maxSum is :" + maxSum);
    }

    public static void main(String[] args) {
        int number[] = { 1, -2, 6, -1, 3 };
        printSubArrPrefixSum(number);
    }
}
