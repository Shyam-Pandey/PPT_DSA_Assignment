package Assignment_6;
import java.util.*;
public class Question5 {
    public int minProductSum(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length, res = 0;
        for (int i = 0; i < n; ++i) {
            res += nums1[i] * nums2[n - i - 1];
        }
        return res;
    }
}