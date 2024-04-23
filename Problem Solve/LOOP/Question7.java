import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter number :");
        int userInput = sc.nextInt();
        for(int i= 0; i<=userInput; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        System.out.println("it is even no of your given criteria");
        sc.close();
    }
}
