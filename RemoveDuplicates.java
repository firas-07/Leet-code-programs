public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4};
        System.out.println(removeDuplicates(arr));
    }
    static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int count = 1; // Start j from 1 because the first element is always unique
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // If current element is not equal to the previous elements
                nums[count] = nums[i];
                count++; // Increment count
            }
        }
        return count; //  count of unique elements
    }
}
