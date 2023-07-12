package Assignment_10;

public class Question4 {
    public static int lengthOfString(String str){

        if (str.equals(""))
            return 0;
        else
            return lengthOfString(str.substring(1)) + 1;  
}
    public static void main(String[] args){
        String str = "abcassjkbaJKSNAln";
        int len = lengthOfString(str);
        System.out.println(len);
	}
}