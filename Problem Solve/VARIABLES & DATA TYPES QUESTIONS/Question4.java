import java.util.*;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);  //scnr
        System.out.println("enter length : ");
        double len = sc.nextDouble();

        System.out.println("enter width : ");
        double width = sc.nextDouble();

        System.out.println("enter height : ");
        double height = sc.nextDouble();

        double volCuboid = len*width*height;

        System.out.println("volume of cuboid is : "+volCuboid);

    }  Scanner sc = new Scanner (System.in);
    
}
