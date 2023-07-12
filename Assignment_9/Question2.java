package Assignment_9;

public class Question2 {
    public static long sumOfFirstNantural(long num){
        // long sum = (num * (num + 1)) / 2;
        // return sum;
        if(num == 1)
        return 1;

       return (num + sumOfFirstNantural(num -1)); 
    }

    public static void main(String [] args){
        long n = 10 ;
       long res = sumOfFirstNantural(n); 
       System.out.println(res);
    }
}
