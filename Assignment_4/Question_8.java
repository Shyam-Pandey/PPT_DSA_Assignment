package Assignment_4;

public class Question_8 {
    public int[] shuffle(int[] nums, int n) {
        
        int size = nums.length;
        int result[] = new int[size];
        int i = 0 , j = n,k=0;
        while(i<n){
            result[k] = nums[i];
            result[k+1] = nums[j];
            i++;
            j++;
            k=k+2;
        }
        return result;
    }
}
