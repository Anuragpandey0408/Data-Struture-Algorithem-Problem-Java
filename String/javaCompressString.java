public class javaCompressString {

    public static String compress(String str) {
        StringBuilder newStr = new StringBuilder(); // Using StringBuilder for efficient string manipulation

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            // Count consecutive duplicate characters
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // Append the character
            newStr.append(str.charAt(i));

            // Append the count if greater than 1
            if (count > 1) {
                newStr.append(count);
            }
        }

        return newStr.toString(); // Convert StringBuilder to String
    }

    public static void main(String[] args) {
        String str = "aaabbbccddd";
        System.out.println(compress(str));
    }
}
