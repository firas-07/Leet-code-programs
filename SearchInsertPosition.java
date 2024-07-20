public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 0;
        System.out.println(searchInsert(arr,target));
    }
    static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length ; i++) {
            if(i == 0 && target < nums[i]){
                return i;
            }
            else if(i == nums.length - 1 && target > nums[i]){
                return i+1;
            }
            else if(target > nums[i] && target < nums[i+1]){
                return i+1;
            }
            else if (target < nums[i] && target > nums[i-1]){
                return i-1;
            }
            else if (target == nums[i]){
                return i;
            }
        }
        return -1;
    }
}
