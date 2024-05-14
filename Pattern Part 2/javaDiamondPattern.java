public class javaDiamondPattern {

    public static void diamond_pattern(int n){
        // outer-loop = 1st half
        for(int i=1; i<=n; i++){
            
            // print space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //print star
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
           System.out.println(); 
        }

        // outer-loop = 2st half
        for(int i=n; i>=1; i--){
            
            // print space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //print star
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
           System.out.println(); 
        }
    }
    public static void main(String[] args) {
        diamond_pattern(7);
    }
}
