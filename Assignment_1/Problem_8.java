public class Problem_8 {
        public int[] findErrorNums(int[] nums) {
            int size = nums.length;
            Arrays.sort(nums);
            int ar[] = new int[size];
            int res[] = new int[2];
            for(int i=0 ; i<size ; i++){
                ar[i] = i+1;
            }
            int j = 0;
            for(int i=0 ; i < size ; i++){
                if(nums[i]!=ar[j]){
                    res[0] = nums[i];
                    res[1] = ar[j];
                    break;
                }
                else{
                    j++;
                }
                
            }
            return res;
            
        }
}
