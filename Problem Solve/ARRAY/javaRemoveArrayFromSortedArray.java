

public class javaRemoveArrayFromSortedArray {

    public static int removeDuplicates(int sortedArray[]){

        int j = 2;

        for(int i = 2; i < sortedArray.length; i++){
            if (sortedArray[i] != sortedArray[j-2]){
                sortedArray[j] = sortedArray[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int sortedArray[] = {0,0,2,3,3,3,4,4,4};
        int newLength = removeDuplicates(sortedArray);

        System.out.println("New length: " + newLength);
        System.out.print("Modified array: [");
        for (int i = 0; i < newLength; i++) {
            System.out.print(sortedArray[i] + (i < newLength - 1 ? ", " : ""));
    }
    System.out.println("]");
   }
}

