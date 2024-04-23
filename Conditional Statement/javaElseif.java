import java.util.Scanner;
public class javaElseif {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter age :");
    int inputAge = sc.nextInt();

    if (inputAge >= 18){
        System.out.println("adult");
    }

    else if (inputAge >= 13 && inputAge <= 17){
        System.out.println("teenager");
    }
    
    else{
        System.out.println("child");
    }  
  }
}
