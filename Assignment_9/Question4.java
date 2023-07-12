package Assignment_9;

public class Question4 {
    public static long nToRaisePower(long n , int p){
        // long sum = (num * (num + 1)) / 2;
        // return sum;
        if(p==0 && n!=0)
          return 1;
        else if(p==0 && n==0)
          return -1;
        if(p == 1)
          return n;
         // -1 means invalid Power of given number to raise power is can not be detemined.

       return n * nToRaisePower(n, p-1); 
    }

    public static void main(String [] args){
        long num = 0;
        int p = 0;
       long res = nToRaisePower(num , p); 
       System.out.println(res);
    }   
}
