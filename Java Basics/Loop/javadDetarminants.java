public class javadDetarminants {
    public static void main(String[] args) {
        double a = 2.3;
        double b = 3.8;
        double c = 2.5;

        double detarminant = b * b - 4 * a * c;

        if (detarminant > 0) {
            double root1 = -b + Math.sqrt(detarminant) / (2 * a);
            double root2 = -b - Math.sqrt(detarminant) / (2 * a);
            System.out.println(root1);
            System.out.println(root2);
        } else if (detarminant == 0) {
            double root3 = -b / 2 * a;
            System.out.println(root3);
        } else {
            double real = -b / 2 * a;
            double imag = -b + (-detarminant);
            System.out.println(real);
            System.out.println(imag);
        }
    }
}
