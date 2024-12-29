
// Output: 4334 is palindrome number
public class javaPalindromeNum {

    public static boolean palindromeNumber(int num) {
        int revNum = 0; // store reverse number
        int duplicateNum = num; // store duplicate number
        while (num > 0) {
            int lastDigit = num % 10; // get last digit of number
            revNum = (revNum * 10) + lastDigit; // reverse number
            num = num / 10; // remove last digit from number
        }
        if (duplicateNum == revNum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 4334; // number imput
        if (palindromeNumber(num)) {
            System.out.println(num + " is palindrome number");
        } else {
            System.out.println(num + " is not palindrome number");
        }
    }
}



// Output true
/*
public class Solution {
    public static boolean palindromeNumber(int n) {
        int revNum = 0; // store reverse number
        int duplicateNum = n; // store duplicate number
        while (n > 0) {
            int lastDigit = n % 10; // get last digit of number
            revNum = (revNum * 10) + lastDigit; // reverse number
            n = n / 10; // remove last digit from number
        }
        if (duplicateNum == revNum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 4334; // number imput
        System.out.println(palindromeNumber(n));
    }
}
 */