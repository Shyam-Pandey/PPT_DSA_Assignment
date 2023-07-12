package Assignment_9;
import java.util.*;

public class Question1 {
	static boolean powerOf2(int n){
		if (n == 1)
			return true;

		else if (n % 2 != 0 || n == 0)
			return false;

		return powerOf2(n / 2);
	}

	// Driver Code
	public static void main(String[] args)
	{
		// int n = 64;
        int n = 32;

		if (powerOf2(n) == true)
			System.out.print("True"+ "\n");
		else
			System.out.print("False"+ "\n");
	}
}

