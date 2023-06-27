package Assignment_4;

public class Question_5 {
    public int arrangeCoins(int n) {
       long start = 0, end = n;
       long coins ,k;

       while(start<=end){
        k = start + (end - start)/2;
        coins = k * (k + 1)/2;

        if(coins == n) return (int) k;
        else if(coins > n) end = k - 1;
        else start = k + 1; 
       }
       return (int) end;
    }
}