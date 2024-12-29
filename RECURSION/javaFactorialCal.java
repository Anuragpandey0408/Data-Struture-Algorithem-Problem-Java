public class javaFactorialCal {

    public static int CalFac(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = CalFac(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(CalFac(n));

    }
}
