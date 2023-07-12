package Assignment_10;
import java.util.*;

public class Question1 {
	static boolean powerOf3(int n){
		if (n == 1)
			return true;

		else if (n % 3 != 0 || n == 0)
			return false;

		return powerOf3(n / 3);
	}

	// Driver Code
	public static void main(String[] args)
	{
		// int n = 64;
        int n = -1;

		if (powerOf3(n) == true)
			System.out.print("True"+ "\n");
		else
			System.out.print("False"+ "\n");
	}
}

