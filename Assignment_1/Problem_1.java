class Problem_1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int res[] = new int[2];
        res[0]=res[1]=-1;
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            int secondNum = target - num;
            if(m.containsKey(secondNum)){
                res[0] = m.get(secondNum);
                res[1] = i;
                return res;
            }
            m.put(nums[i],i);
        }
        return res;
        
    }
}