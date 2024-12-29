public class javaInvertedAndRotatedHalfPyramid {

    public static void invertedRotHalfPyramid(int totRow){
        // outer loop
        for(int i=1; i<=totRow; i++){
            // space print
            for(int j=1; j<=totRow-i; j++){
                System.out.print(" ");
            }
            // star print
            for (int j=1; j<=i; j++){
            System.out.print("*");
           }
           System.out.println();
        }
        
    }
    public static void main(String[] args) {
        invertedRotHalfPyramid(10);
    }
}
