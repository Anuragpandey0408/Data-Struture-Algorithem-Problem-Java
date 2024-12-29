public class javaSumofNnum {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(CalnNaturalNum(n));
    }

    public static int CalnNaturalNum(int n) {
        // base case
        if (n == 1) {
            return 1;
        }

        int Snm1 = CalnNaturalNum(n - 1);
        int Sn = n + Snm1;
        return Sn;
    }

}
