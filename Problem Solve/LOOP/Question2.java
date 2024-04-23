import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput;
        int fact = 1;
        
        System.out.print("Enter Possitive Number :");
        userInput = sc.nextInt();
        for(int counter = 1; counter<=userInput; counter++){
            fact = fact * counter;
        }
         System.out.println("factorial is :"+fact);
         sc.close();
        }
    }

