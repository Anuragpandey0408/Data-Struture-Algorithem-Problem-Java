public class javaSubstring {

    public static String SubString(String str, int si, int ei) {
        String substr = "";
        for (int i = 0; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(SubString(str, 0, 5));
    }
}
