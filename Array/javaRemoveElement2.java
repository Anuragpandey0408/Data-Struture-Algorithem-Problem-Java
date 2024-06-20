public class javaRemoveElement2 {

    public static int RemoveElement(int[] nums, int val) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            if (nums[end] == val) {
                end--;
            } else {
                if (nums[start] == val) {
                    // swap
                    int temp = nums[end];
                    nums[end] = nums[start];
                    nums[start] = temp;
                    start++;
                    end--;
                } else {
                    start++; // start != val so start++;
                }
            }
        }
        return end + 1; // Return the new length of the array
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 2, 3, 4, 2 };
        int val = 2;
        System.out.println(javaRemoveElement2.RemoveElement(nums, val));
    }
}
