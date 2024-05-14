public class javaHollowRombus {

    public static void hollow_rombus(int n) {
        for (int i = 1; i <= n; i++) {
            // PRINT SPACE
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // PRINT HOLLOW_RECTANGLE
            for (int j = 1; j <= n; j++) {
                // cell - (i,j)
                if (i == 1 || i == n || j == 1 || j == n) {
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
        hollow_rombus(8);

    }
}
