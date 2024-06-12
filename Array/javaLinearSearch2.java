import java.util.*;


public class javaLinearSearch2 {

    public static int Menue(String menue[], String Food) {
        for (int i = 0; i < menue.length; i++) {
            if (menue[i].equals(Food)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String menue[] = {"dosa", "samosa", "idle_sambhar", "kachori"};
        String Food = "kachori";

        int index = Menue(menue, Food);
        if (index != -1) {
            System.out.println("Your food is ready: " + menue[index]);
        } else {
            System.out.println("Not Found");
        }
    }
}
