package Assignment_10;

public class Question8 {

    public static void countConsonant(String str){
         int c = 0;
        for(int i  = 0; i < str.length(); i++){
            char ch=str.charAt(i);
            if( ch=='a' || ch=='e' || ch=='o' || ch=='u' || ch=='i' || ch == ' '){
                continue;
            }
            else
            c = c +1;
        }
        System.out.println("Number of consonants in the string are: "+c );
    }

    public static void main(String[] args) {
        String s="aaaaaaauuuuuuuu";
        countConsonant( s);  
    }
    
}
