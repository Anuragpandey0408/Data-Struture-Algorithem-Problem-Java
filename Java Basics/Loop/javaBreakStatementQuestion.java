import java.util.Scanner;

public class javaBreakStatementQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Enter Number : ");
            int Numbr = sc.nextInt();
            if (Numbr % 10 == 0){
            break;
            }
        }while(true);
        sc.close();
    }
}
