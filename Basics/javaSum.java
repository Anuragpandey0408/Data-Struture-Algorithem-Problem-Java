import java.util.Scanner;

public class javaSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first no : ");
        int input1 = sc.nextInt();

        System.out.print("enter second number : ");
        int input2 = sc.nextInt();
        
        System.out.print("sum of two number is : ");
        System.out.println(input1+input2);
        
    }
}
