import java.util.Scanner;

public class javaifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       System.out.print("enter age : ");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("ready for voat\nready for driving");
        }

        if (age >13 && age <18){
            System.out.println("you are teenager");
        }
        
        else {
            System.out.println("you are not adult");

            }
        
    }
    
}
