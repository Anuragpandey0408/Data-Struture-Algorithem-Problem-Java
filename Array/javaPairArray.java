import java.util.*;

public class javaPairArray {

    public static void pairArray(int number[]){
        int tp = 0;
        for(int i = 0; i<number.length; i++){
            int curr = number[i];
        for(int j = i+1; j<number.length; j++){
            System.out.print("(" + curr + "," + number[j] + ") ");
            tp++;
        }
        System.out.println();
    }
    System.out.print("total pair :"+tp);
}
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12};
        pairArray(numbers);
    }
}
