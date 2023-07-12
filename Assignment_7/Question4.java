package Assignment_7;
public class Question4 {
    String reverseWords(String s) {
        String res = "";
        String temp = "";
        for(int i = s.length()-1; i >= 0; i--)
        {
            char c = s.charAt(i)
            if(c != ' ')
                temp += c;
            else
            {
                res = ' ' + temp + res;
                temp = "";
            }
        }
        res = temp + res;
        return res;
    }
};