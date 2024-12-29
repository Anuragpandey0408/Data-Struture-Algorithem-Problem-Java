public class javaStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb); // output will be - a to z // timeComplexity - 0(26)
        System.out.println(sb.length());
    }
}
