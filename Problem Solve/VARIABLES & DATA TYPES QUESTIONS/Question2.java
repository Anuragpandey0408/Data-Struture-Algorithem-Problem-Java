import java.util.*;
/*
  Question 2: In a program, input the side of a square. You have to output the area of the
  square.
  (Hint : area of a square is (side x side)) 
 
  */

public class Question2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        // input side of squre 
        System.out.print("enter side of squre : ");
        int side = sc.nextInt();

        int sideSqure = side * side;
        System.out.println("side of squre is :"+sideSqure);
    }
}
