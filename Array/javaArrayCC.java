public class javaArrayCC {
    public static void update(int marks[], int nonChangable){
        nonChangable = 10;
        for(int i=0; i<marks.length; i++){ // all index reached in array using this loop!!
           marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {33,50,67};
        int nonChangable = 5;
        update(marks, nonChangable);
        System.out.println(nonChangable);
    
    // same loop used to print our marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}   

