
public class Question4 {

    public static void printNum(int n){
        int counter = 1;
        // outer loooop
        for(int i = 1; i<=n; i++){
            // inner loooop
            for(int j = 1; j<=n; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();                                 
        }
    }
    public static void main(String[] args) {
        printNum(4);
    }
}
