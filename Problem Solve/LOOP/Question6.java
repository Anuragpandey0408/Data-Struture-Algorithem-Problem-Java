import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int userInput = sc.nextInt();
        for (int i = userInput; i>=1; i--){
            System.out.println(i+"");
            sc.close();
        }
    }
}
