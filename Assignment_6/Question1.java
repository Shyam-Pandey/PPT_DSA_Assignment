package Assignment_6;

public class Question1 {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int l = 0 , r = n; // Initialzie l and r pointer
        int []res = new int[n+1]; // Create a array with name res of size n+1
        char chr = s.charAt(n-1);
        for(int i = 0; i <n ; i++){
            char chr1  = s.charAt(i); // Find char at ith position
            if(chr1 =='I'){  // Check if char is I then put value of left l pointer in res array and icrease value by 1
                res[i] = l;
                l++;
            }
            else{
               res[i] = r; // Check if char is D then put value of right r pointer in res array and decrease value by 1
               r--; 
            }
        }
        if(chr =='D') res[n] = r; // Check last char in string  if it is "D" then put current value of r pointer
        else res[n] = l; // Else put current value of l pointer

        return res;
    }
}