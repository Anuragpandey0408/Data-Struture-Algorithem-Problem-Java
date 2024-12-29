public class javabintoDec {

    public static void BinToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;    // initilise with 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;  // find lastdigit ?
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));

            pow++;
            binNum = binNum / 10; // last digit hata diya !
        }
        System.out.println("decimal of "+ myNum +" ="+decNum);
    }
    public static void main(String[] args) {
        BinToDec(111);
        
    }
}
