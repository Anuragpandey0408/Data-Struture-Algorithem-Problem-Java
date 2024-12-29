import java.util.Scanner;

public class javaStringstr {
    public static void main(String[] args) {
        // define char struture
        char arr[] = {'a','b','c','d'};
        
        // define string struture
        String str = "abcd";
  
        String str2 = new String("encoder");
  
        System.out.println(arr);
        System.out.println(str);
        System.out.println(str2);
        
        // input/output in string
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
        sc.close();

        // string length
        String fullName = "encoder is coder";
        System.out.println(fullName.length());
    }
}
