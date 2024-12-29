public class javaFloydTriangle {

    public static void floyd_triangle(int n){
        int counter=1;
        // line print - outer loop
        for(int i=1; i<=n; i++){
            // counter print - inner loop - how many time will counter be printed
            for(int j=1; j<=i; j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyd_triangle(10);
    }
}
