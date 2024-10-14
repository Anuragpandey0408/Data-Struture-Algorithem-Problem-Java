// starting point is bottom left corner cell;
public class javasearchInsortedmatrix2 {

    public static boolean searchinsortedmatrix2(int matrix[][], int key){
        int row = matrix.length - 1, column = 0;

        while (row >= 0 && column < matrix.length){
            // key and cell value in same place
            if(matrix[row][column] == key){
                System.out.println("key is found at (" + row + "," + column + ")");
                return true;
            }
            // right move 
            else if (matrix[row][column] < key){
                column++;
            }
            // top move
            else {
                row--;
            }
        }
        // if value is not in matrix
        System.out.println("VALUE IS NOT IN MATRIX!!!");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}};
            int key = 35;
            searchinsortedmatrix2(matrix, key);
    }
}
