import java.util.Scanner;

public class javaSum {
    public static void main(String[] args) {
        Scanner b = new Scanner (System.in);
        System.out.print("enter number :");
        int n = b.nextInt();
        int sum = 0;
        int i = 1; // counter
        while (i<=n){
            sum = sum +i;
               i++;
        }

        System.out.println(sum);
        
        }
        
    }
