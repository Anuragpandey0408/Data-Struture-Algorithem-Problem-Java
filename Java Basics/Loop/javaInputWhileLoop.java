import java.util.Scanner;

public class javaInputWhileLoop {
    public static void main(String[] args) {
        Scanner s1 = new Scanner (System.in);
        System.out.print("enter number :");
        int range = s1.nextInt();
        int counter = 1;
        while (counter <= range){
            System.out.println(counter);
            counter++;
            s1.close();
        }
        
    }
}
