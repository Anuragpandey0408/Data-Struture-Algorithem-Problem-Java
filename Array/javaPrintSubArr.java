public class javaPrintSubArr {

    public static void printSubarr(int number[]){
        int total_sub_array = 0;
        for(int i=0; i<=number.length; i++){  // start
            int start = i;
            for(int j=i; j<=number.length; j++){  //end
                int end = j;
                for(int k= start; k<end; k++){  // print subarray
                    System.out.print(number[k] + " ");
                }
                total_sub_array++;
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("total sub array are :" + total_sub_array);
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        printSubarr(number);
    }
}
