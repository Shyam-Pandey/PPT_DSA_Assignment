package Assignement_3;

public class Question_1 {
    public int threeSumClosest(int[] nums, int target) {
        int size = nums.length;
        int min_diff = Integer.MAX_VALUE;
        int sum = 0;
        int closest_sum = 0;
        Arrays.sort(nums);
        for(int p1 = 0; p1 < size ; p1++){
            int p2 = p1 + 1; int p3 = size - 1;
            while(p2<p3){
                sum = nums[p1] + nums[p2] + nums[p3] ;
                if(sum < target) p2++;
                else if(sum > target) p3--;
                else return sum;
                int diff = Math.abs(sum-target);
                if(diff < min_diff){
                    min_diff = diff;
                    closest_sum = sum;
                }
            }
        }
        return closest_sum;
        
    }
}