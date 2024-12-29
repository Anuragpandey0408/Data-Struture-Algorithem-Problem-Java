public class javaSolidRombusPattern {

    public static void solid_rombus_pattern(int n){
        for(int i=1; i<=n; i++){
            // PRINT SPACE
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            } 
            // PRINT STAR
            for(int j=1; j<=n; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solid_rombus_pattern(7);
        
    }
}
