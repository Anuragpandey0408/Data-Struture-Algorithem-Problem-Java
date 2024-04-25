import java.util.Scanner;

public class javaFactorial {

    public static void Factorial(int fact){
        int f = 1;
        for(int i=1; i<=fact; i++){
            f = i*f;
        }
        System.out.println("The factorial of " + fact + " is: " + f);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int fact = sc.nextInt();
        Factorial(fact);
        sc.close();
    }
}
