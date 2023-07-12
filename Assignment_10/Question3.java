package Assignment_10;

public class Question3 {
    
    public static void setOfString(String str, String curr,int i){
        if (i == str.length()){
            System.out.print(curr + " ");
            return;
        }
    setOfString(str,curr,i+1);
    setOfString(str,curr+str.charAt(i),i+1);
}

    public static void main(String[] args){
		// int n = 64;
        String str = "abc";
        String curr="";
        int i = 0;
        setOfString(str,curr,i);
	}
}
