public class javaInvertedHalfPyramidWithNumber {

    public static void inverPyrmNumb(int totRows) {
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totRows - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverPyrmNumb(4);

    }
}
