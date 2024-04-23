import java.util.*;

//   Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
//   these 3 numbers.
//   (Hint : Average of N numbers is sum of those numbers divided by N)

public class Question1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer : ");
        int input1 = sc.nextInt();
        System.out.print("Enter first integer : ");
        int input2 = sc.nextInt();
        System.out.print("Enter first integer : ");
        int input3 = sc.nextInt();

        int avrg = (input1 + input2 + input3) / 3;
        System.out.println("Avrage is : "+ avrg);



    }
}