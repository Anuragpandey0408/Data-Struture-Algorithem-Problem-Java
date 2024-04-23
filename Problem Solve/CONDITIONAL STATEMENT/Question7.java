// Write a Java program to input week number(1-7) and print day of week name
// using switch case.

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter week (1-7): ");
        int week = sc.nextInt();

        switch(week){
            case 1: System.out.println("monday");
                       break;
            case 2: System.out.println("tuesday");
                       break;
            case 3: System.out.println("wednesday");
                       break;
            case 4: System.out.println("thursday");
                       break;
            case 5: System.out.println("friday");
                       break;
            case 6: System.out.println("saturday");
                       break;
            case 7: System.out.println("sunday");
                       break;
        }
        
    }
}
