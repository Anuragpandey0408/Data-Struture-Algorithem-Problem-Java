/*

public class javaTernaryOprator  {
    public static void main(String[] args){

        int number = 7;
        
        // ternary oprator :- ternary oprator is batter then if else condition
        String variable = (number % 2 == 0) ? "even":"odd";
        System.out.println(variable);

    }
    
}

*/

import java.util.Scanner;

public class javaTernaryOprator  {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter marks : ");
        int marks = sc.nextInt();
        
        // ternary oprator :- ternary oprator is batter then if else condition
        String result = (marks >= 33) ? "pass":"fail";
        String resultMarit = (marks >= 90 && marks <= 100) ? "marit listed":"try to next time to goes to marit";
        System.out.println(resultMarit);
        System.out.println(result);

    }
    
}
