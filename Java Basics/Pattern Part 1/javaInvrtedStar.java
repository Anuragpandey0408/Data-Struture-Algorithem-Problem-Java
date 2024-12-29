public class javaInvrtedStar {
    public static void main(String[] args) {
        int n = 8;
        for(int line = 1; line <=n; line++){  // line ++
            // one line
            for(int star = 1; star <= n-line+1; star++){   // print $ according to line
                System.out.print("!");
            }
                System.out.print("\n");
        }
    }
}
