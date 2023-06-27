package Assignment_4;

public class Question_6 {

    public int[] sortedSquares1(int[] nums) {

        /* Solution 1 */
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            nums[i] = val * val;
        }
        Arrays.sort(nums);
        return nums;
    }
         public int[] sortedSquares2(int[] nums) {
        /* Solution 2 */
        int l = 0, r = nums.length - 1, i = nums.length - 1;
        int result[] = new int[nums.length];
        while (l <= r) {
            if (nums[l] * nums[l] > nums[r] * nums[r]) {
                result[i] = nums[l] * nums[l];
                l++;
            } else {
                result[i] = nums[r] * nums[r];
                r--;
            }
            i--;
        }

        return result;
    }
}