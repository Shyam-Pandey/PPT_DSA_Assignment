package Assignment_7;

public class Question6 {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
         return false;
        // int index=0 ;
        // if(s.length() == goal.length()){
        //    index = (s+s).indexOf(goal);
        // } 
        // if goal is rotated string of s then gaol must be available in concatenation of string s with self s
        // i.e s = "hello" goal = "llohe" then temp = s+s = "hellohello"
        // we can see that goal is avaialble in temp;
        return (s.length() == goal.length() && (s+s).indexOf(goal) != -1 );
    }
}