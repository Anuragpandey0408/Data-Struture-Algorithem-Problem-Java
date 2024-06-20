public class javaMaxSubArr_KadaneAlgo {

    public static void kadans(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<numbers.length; i++){
            currSum = currSum + numbers[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("our max subarray sum is : "+maxSum);
    }
    
    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        kadans(numbers);
    } 
}
