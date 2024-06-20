public class javaRotateArray {

    public static int RotateArr(int[] nums){
        int[] arr = new int[0];
        int m = nums.length;
        int k = 3;
        for(int i = m-k; i< m-1; i++){
            arr[0] = nums[i];
            i++;
        }
        for(int j=0; j<m-k-1; j++){
            arr[0] = nums[j];
            j++;
        }
        return arr[0];
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        System.out.println(RotateArr(nums));
        
    }
}
