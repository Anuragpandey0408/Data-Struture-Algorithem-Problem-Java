import java.util.Scanner;

public class javaAreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter rad : ");
        float rad = sc.nextFloat();

        System.out.println("area of rad is : ");
        System.out.println(3.14f * rad * rad);
    }
    
}
