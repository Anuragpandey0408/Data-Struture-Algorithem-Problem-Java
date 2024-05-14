public class javaNumberPyramid {

    public static void number_pyramid(int n){
        // OUTER LOOP
        for(int i=1; i<=n; i++){

            //PRINTED SPACES
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //PRINED NUMBER
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        number_pyramid(5);
    }
}
