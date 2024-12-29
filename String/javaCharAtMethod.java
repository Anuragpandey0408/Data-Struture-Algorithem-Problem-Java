// import java.util.*;
public class javaCharAtMethod {

    public static void printfullLatter(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // concatination ~
        // System.out.print("Enter firstName :");
        // String firstName = sc.nextLine();
        // System.out.print("Enter lastName :");
        // String lastName = sc.nextLine();
        String firstName = "Sradha";
        String lastName = "Khapra";
        String fullName = firstName + " " + lastName;
        // System.out.println(fullName);
        // find length
        System.out.println(fullName.length());
        // charAt method() ~
        // System.out.println(fullName.charAt(5));
        printfullLatter(fullName);

    }
}
