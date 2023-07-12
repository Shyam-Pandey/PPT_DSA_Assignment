package Assignment_9;

public class Question3 {
    public static long factorial(long num){
        // long sum = (num * (num + 1)) / 2;
        // return sum;
        if(num==0)
        return 0;
        if(num == 1)
        return 1;
        if(num==2)
        return 2;

       return (num * factorial(num -1)); 
    }

    public static void main(String [] args){
        long num = 5 ;
       long res = factorial(num); 
       System.out.println(res);
    }   
}
