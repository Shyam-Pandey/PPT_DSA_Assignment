package Assignment_7;
import java.util.* ;
import java.io.*;

public class Question2 {
   public static boolean isStrobogrammatic(String s){
    	// Write your code here.
		int l = 0 , r = s.length() - 1;
		if(s.length()==0 || s==null) return false;
		Map<Character, Character> m = new HashMap<Character, Character>();
			m.put('0', '0');
			m.put('1', '1');
			m.put('6', '9');
			m.put('8', '8');
			m.put('9', '6');
	
		while(l<=r){
			if( m.containsKey(s.charAt(r))==false || s.charAt(l)!= m.get(s.charAt(r))){
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
}