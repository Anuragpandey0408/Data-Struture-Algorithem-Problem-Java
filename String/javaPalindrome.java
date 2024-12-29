public class javaPalindrome {

    public static boolean checkPalindrome(String stringName){

        int n = stringName.length();
        for(int i=0; i<n/2; i++){
            if (stringName.charAt(i) != stringName.charAt(n-1-i)){
            // not a palindrome
            return false;
            }
        }
            return true;
    }
    public static void main(String[] args) {
        String stringName = "racecar";
        System.out.println(checkPalindrome(stringName));
    }
}
