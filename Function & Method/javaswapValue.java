import java.util.Scanner;
public class javaswapValue {
    public static void swap(int a, int b) {
        int temp = a;   // a = 10  b = 20
        a = b;
        b = temp;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        
    }
    public static void main(String[] args) {
       // swap = value exchange
        Scanner sc = new Scanner (System.in);
        System.out.print("enter value of a :");
        int a = sc.nextInt();
        System.out.print("enter value of b :");
        int b = sc.nextInt();
        int temp;
        swap(a,b); 
    }
}
