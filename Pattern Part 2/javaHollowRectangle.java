
public class javaHollowRectangle {

    public static void hollowRectangle(int totRows, int totCol) {
        // outer loop
        for (int i = 1; i <= totRows; i++) {
            // inner columns
            for (int j = 1; j <= totCol; j++) {
                // cell - (i,j)
                if (i == 1 || i == totRows || j == 1 || j == totCol) {
                    // boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        hollowRectangle(4, 5);
    }

}
