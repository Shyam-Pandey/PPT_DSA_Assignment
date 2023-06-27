package Assignment_2;

class Question_3 {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int p1 = 0; int p2 = 1;
        int result = 0 ; 
        while(p2 < nums.length){
            int diff = nums[p2] - nums[p1];
            if(diff == 1){
                result = Math.max(result , p2-p1+1);
            }
            if(diff<=1)
            p2++;
            else
            p1++;
        }
        return result;
    }
}
