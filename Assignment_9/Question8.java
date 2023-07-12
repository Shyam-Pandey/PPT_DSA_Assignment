package Assignment_9;

public class Question8 {

    public static int product(int [] num , int n){
        if(n==0)
        return num[0];
       return num[n] * product(num , n-1);
    }
    public static int produsctofArray(int nums[]){
        if (nums == null || nums.length==0) return 0 ;
        int n = nums.length - 1;
        int res = product(nums , n);
        return res;
    }
    
    public static void main(String [] args){
        int nums [] = {20,40,900,4,5,800,500};

        System.out.println(produsctofArray(nums));

}
}
