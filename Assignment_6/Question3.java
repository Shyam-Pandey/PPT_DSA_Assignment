package Assignment_6;

public class Question3 {
    public boolean validMountainArray(int[] arr) {
        int size  = arr.length , i = 0;
        if(size==2){
            return false;
        }
        
        while(i+1 < size && arr[i] < arr[i+1])
          i++;  

        if(i == 0 || i == size - 1)
          return false;

        while(i+1<size && arr[i] > arr[i+1])
         i++;  

         return i == size - 1;    
         }
}