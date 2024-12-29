import java.util.Scanner;

public class javaProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("product of : ");
        int input1 = sc.nextInt();

        System.out.print("product of : ");
        int input2 = sc.nextInt();
        
        System.out.print("product is : ");
        System.out.println(input1 * input2);
    }
    
}
