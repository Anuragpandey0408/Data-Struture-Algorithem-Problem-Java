import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value : ");
        int userInput = sc.nextInt();
        for (int i = userInput; i>=1; i--){
            if (i%2 != 0){
                System.out.println(i);
            }
        }
        System.out.println("Printed Reverse odd Digit");
        sc.close();
    }
}
