import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :");
        int userInput = sc.nextInt();
        for (int i = userInput; i>=0; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        } 
        System.out.println("Reverse Even Number is Printed");
        sc.close();
    }
}
