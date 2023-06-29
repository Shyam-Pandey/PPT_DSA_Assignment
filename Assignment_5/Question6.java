import java.util.*;

public class Question6 {
    public List<Integer> findDuplicates(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        HashSet<Integer> s = new HashSet<Integer>(); 
        ArrayList<Integer> lst = new ArrayList<Integer>();

        for(int num : nums){
            if(map.containsKey(num)){
            int count = map.getOrDefault(num, 0);
            map.put(num, count + 1);
            }
            else
            map.put(num,1);
        }

        for(int num : nums){
            s.add(num);
        }
        for(int n : s){
            if(map.get(n)>1)
              lst.add(n);
        }
        return lst;
    }
}