/* Question 2:
You are given a number (eg - 2019), convert it into a String of english like "two zero one nine". Use a recursive function to solve this problem.
NOTE - The digits of the number will only be in the range 0-9 can't be 0. d the last digit of a number
Sample Input: 1947
Sample Output: "one nine four seven" */

public class javaFindNumbersName {
    static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
public static String findNumbersName(int num){
    if(num==0){
        return "";
    }
    int lastDigit = num%10;
    return findNumbersName(num/10) + digits[lastDigit] + " ";
}
    public static void main(String[] args) {
        int num = 1947;
        System.out.println(findNumbersName(num));
    }
}
