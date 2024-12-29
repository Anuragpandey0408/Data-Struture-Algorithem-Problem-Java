public class javaDirection {

    public static float getShortestPath(String Path){
        int x=0 , y=0;

        for (int i=0; i<Path.length(); i++){

            char dir = Path.charAt(i);

            if (dir == 'E'){
                x++;
            }

            else if (dir == 'W'){
                x--;
            }

            else if (dir == 'N'){
                y--;
            }

            else { 
                y++; 
            }
        }

        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
        String Path = "WNEENESENNN";
        System.out.println(getShortestPath(Path));
    }
}
