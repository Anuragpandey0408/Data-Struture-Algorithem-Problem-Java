
public class javaPrimeorNotprime {      //  1st approch

    public static String isPrime(int n){
        // boolean isPrime = true;
        for(int i=2; i<=n-1; i++){
            if(n % i == 0){              // completly dividing
                return "is not prime";
            }
        }
        return "is prime";
    }
   public static void main(String[] args) {
    System.out.println(isPrime(6));
   } 
}




