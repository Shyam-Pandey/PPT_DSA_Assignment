class Solution {
    public int arrayPairSum(int[] nums) {
        int size = nums.length;
        int resultSum = 0;
        Arrays.sort(nums);
        for(int i = 0 ; i<size; i+=2){
            resultSum += nums[i];
        }
        return resultSum;
    }
}