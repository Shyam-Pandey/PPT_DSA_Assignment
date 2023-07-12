package Assignment_9;

public class Question7 {

    public static String permutation(String str, int n){
        if (n==1)
        return str;
        permutation(str, n)
    }

    public static String permutationOfString(String str){
        int n = str.length();

        permutation(str,n);
        return str;

    }
    public static void main(String[] args){
        String s = "ABC";
		// Display the output
		System.out.print(permutationOfString(s));
	} 
}
