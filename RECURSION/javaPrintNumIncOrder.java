public class javaPrintNumIncOrder {

    public static void printInc(int num) {
        if (num == 10) {
            System.out.println(10);
            return;
        }
        System.out.println(num + " ");
        printInc(num + 1);
    }

    public static void main(String[] args) {
        int num = 1;
        printInc(num);
    }
}
