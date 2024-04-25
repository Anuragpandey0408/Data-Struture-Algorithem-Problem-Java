public class javaPrimeorNot2ndApproch {

    public static String isPrime(int n){
        // boolean isPrime = true;
        if(n==2){
            return "is prime";
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){              // completly dividing
                return "is not prime";
            }
        }
        return "is prime";
    }
    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }
}
