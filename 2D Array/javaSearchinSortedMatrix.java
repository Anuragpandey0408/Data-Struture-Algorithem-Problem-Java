// starting point is top right corner cell;
public class javaSearchinSortedMatrix {

    public static boolean stairCasesearch(int matrix[][], int key){
        int row = 0 , column = matrix[0].length-1;

        while(row < matrix.length && column >= 0){
            // key or cell value are same
            if(matrix[row][column] == key){
                System.out.println("found key at : (" + row + "," + column + ")");
                return true;
            }
            // left move;
            else if (matrix[row][column] > key){
                column--;
            }
           // bottom move;
            else {
                row++;
            }
        }

        // if key is not found in matrix
        System.out.println("KEY IS NOT IN MATRIX TRY USING ANOTHER KEY!!!");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = 
        {{10,20,30,40},
         {15,25,35,45},
         {27,29,37,48},
         {32,33,39,50}};
         int key = 100;
         stairCasesearch(matrix, key);
    }
}
