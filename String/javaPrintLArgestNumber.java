public class javaPrintLArgestNumber {
    public static void main(String[] args) {
        // String str1 = "Apple";
        // String str2 = "BanAna";
        // System.out.println(str1.compareTo(str2));
        // System.out.println(str1.compareToIgnoreCase(str2));

        String fruit[] = { "Apple", "Mango", "Banana" };

        String largest = fruit[0];

        for (int i = 0; i < fruit.length; i++) {
            if (largest.compareTo(fruit[i]) < 0) {
                largest = fruit[i];
            }
        }
        System.out.println(largest);
    }
}
