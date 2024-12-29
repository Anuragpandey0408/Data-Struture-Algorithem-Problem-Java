public class javaFabonacii {
    public static void main(String[] args) {
        int n = 5; // 5th term not 5 number
        System.out.println("fabonacii number for 5th term : " + fibonaciiNum(n));
        System.out.println("fabonacii number for 25th term : " + fibonaciiNum(25));
        System.out.println("fabonacii number for 26th term : " + fibonaciiNum(26));
        System.out.println("fabonacii number for 27th term : " + fibonaciiNum(27));
    }

    public static int fibonaciiNum(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fibonaciiNum(n - 1);
        int fnm2 = fibonaciiNum(n - 2);
        int fibn = fnm1 + fnm2;
        return fibn;
    }
}
