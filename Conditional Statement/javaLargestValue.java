public class javaLargestValue {
    public static void main(String[] args) {
            int a = 9;
            int b = 8;
            int c = 7;
            if(a>=b && a>=c){
                System.out.println(a);
            }
            else if (b>=a && b>=c){
                System.out.println(b);
            }
            else if (c>=a && c>=b){
                System.out.println(c);
            }
    }
}