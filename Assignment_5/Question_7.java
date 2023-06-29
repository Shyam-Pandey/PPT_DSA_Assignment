class Solution {
    public int findMin(int[] nums) {
        int low = 0 , high = nums.length-1 , mid;
        int min = Integer.MAX_VALUE;

        while(low<=high){
            mid = (low+high)/2;
            if(nums[low] <= nums[mid]){ // We will check left half is sorted from nums[low] to nums[mid]
                min = Math.min(min,nums[low]); //Find the min value between previous min value and latest min value
                low = mid + 1;                 // for left half
            }
            else{
               min = Math.min(min,nums[mid]); //Find the min value between previous min value and latest
                                                // min value for right half 
               high = mid - 1; 
            }
        }
        return min;
    }
}