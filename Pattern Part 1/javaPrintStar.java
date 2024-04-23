public class javaPrintStar{
    public static void main(String[] args) {
        for(int line = 1; line <=4; line++){  // line ++
            // one line
            for(int star = 1; star <= line; star++){   // print $ according to line
                System.out.print("$");
            }
                System.out.print("\n");
        }
    }
}