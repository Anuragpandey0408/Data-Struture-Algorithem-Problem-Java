public class JavaBinoCoeff {

    public static void factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f = i*f;
        }
        System.out.println("The factorial of " + n + " is: " + f);
    }

    public static int binCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    public static void main(String[] args) {
        factorial(3);
        int result = binCoeff(5, 3);
        System.out.println("The binomial coefficient of 5 choose 3 is: " + result);
    }
}