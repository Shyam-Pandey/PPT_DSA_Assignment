package Assignement_3;

public class Question_4 {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]<target){
                l = mid + 1;
            }
            else if(nums[mid]>target){
                r = mid - 1;
            }
            else{
                return mid; // If target found theen return mid as postion
            }
        }
        return l; // If not found return expacted portion
    }
}
