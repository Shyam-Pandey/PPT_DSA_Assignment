// Sqaure the sorted array keeping in increasing order.
public class Question3 {
    public int[] sortedSquares(int[] nums) {
        int l = 0, r = nums.length - 1,i = nums.length-1;
        int result[] = new int[nums.length];
        while(l<=r){
            if(nums[l] * nums[l] > nums[r] * nums[r]){
            result[i] = nums[l] * nums[l];
            l++;
            }
            else{
                result[i] = nums[r] * nums[r];
                r--;
            }
            i--; 
        }

        return result;
    }
}