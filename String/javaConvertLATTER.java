public class javaConvertLATTER {

    public static String toUpperCase(String str) {
        // 0th index case
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        // empty space check
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                // uppercase character retuen
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    // time complexity - 0(n)
    public static void main(String[] args) {
        String str = "fan of SRK";
        System.out.println(toUpperCase(str));
    }
}
