package Assignment_9;

import java.io.*;
import java.lang.*;

public class Question6 {
	public static int findAP(int a,int d,int N){
		// using formula to find the Nth
		// term t(n) = a(1) + (n-1)*d
		return ( a + (N - 1) * d );
	}

	public static void main(String[] args)
	{
		// starting number
		int a = 2;
		
		// Common difference
		int d = 1;
		
		// N th term to be find
		int N = 5;

		// Display the output
		System.out.print(findAP(a, d, N));
	}
}
