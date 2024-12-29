
/*
public class javaBreakStatement {
    public static void main(String[] args) {
        int counter = 0;
        for (int n = 1; n<=5; n++){
            counter++;
            if(n <= 3){
               System.out.println(counter);
            }
        }
    }
}

*/



public class javaBreakStatement {
    public static void main(String[] args) {
        for(int i = 0; i<=5; i++){
            if ( i == 3 ){
                break;
            }
            System.out.println(i);
        }

        System.out.println("i am out of the looop becz my requirent is fullfill");
    }
}