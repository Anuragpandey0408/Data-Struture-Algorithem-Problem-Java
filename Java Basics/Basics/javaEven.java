import java.util.Scanner;

public class javaEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number : ");
        int A = sc.nextInt();

        if(A % 2 == 0){
            System.out.println("number is even");

        } else {
            System.out.println("number is odd");
        }
        
    }
}
