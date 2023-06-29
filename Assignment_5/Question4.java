import java.util.*;
public class Question4 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> res1 = new HashSet<Integer>();
        Set<Integer> res2 = new HashSet<Integer>();
        Set<Integer> al1 = new HashSet<>();
        Set<Integer> al2 = new HashSet<>();
        
       
        List<List<Integer>> al3 = new ArrayList<>();

        for(int val1 : nums1){
            res1.add(val1);
        }
        for(int val2 : nums2){
            if(!res1.contains(val2))
             al1.add(val2);
        }  
        List<Integer> al4 = new ArrayList<>(al1);

        for(int v2 : nums2){
            res2.add(v2);
        }
        for(int v1 : nums1){
            if(!res2.contains(v1))
                al2.add(v1);
        } 
         List<Integer> al5 = new ArrayList<>(al2); 
         al3.add(al5);
         al3.add(al4);

         return al3;
    }
}