package Assignment_6;
import java.util.HashMap;

public class Questio6 {
        public int[] findOriginalArray(int[] arr) {
        int n = arr.length, i = 0;
        if (n % 2 == 1) return new int[0];
        int[] res = new int[n / 2];
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : arr)
            count.put(num, count.getOrDefault(num, 0) + 1);
        for (int x : count.keySet()) {
            if (count.get(x) > count.getOrDefault(x * 2, 0))
                return new int[0];
            for (int j = 0; j < count.get(x); ++j) {
                res[i++] = x;
                count.put(x * 2, count.get(x * 2) - 1);
            }
        }
        return res;
    }
}
