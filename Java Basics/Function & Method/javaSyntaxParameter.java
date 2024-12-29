import java.util.*;
public class javaSyntaxParameter {


    public static void calculateSum(int num1, int num2) { // user-define function
        int sum = num1 + num2;
        System.out.println("Sum is :"+sum);
    }
    public static void main(String[] args) {  // main function
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter First Value :");
        int a = sc.nextInt();
        System.out.print("Enter Second Value :");
        int b = sc.nextInt();
        calculateSum(a,b);    
        sc.close();                      
    }
}
 