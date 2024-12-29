public class printHalfPyramid {
    public static void main(String[] args) {
        int n = 7;
        for(int line = 1; line<=n; line ++){
            for(int numbr = 1; numbr <= line; numbr++){
                System.out.print(numbr);
            }
            System.out.println();
        }
    }
}
