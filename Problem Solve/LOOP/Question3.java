import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int userInput = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(userInput + " * " + i + " = " + userInput*i);
            sc.close();
        }
    }
}
