// Java Program for finding nth Delannoy Number.
import java.util.*;
import java.lang.*;

public class GfG{
	
	// Return the nth Delannoy Number.
	public static int dealnnoy(int n, int m)
	{
		// Base case
		if (m == 0 || n == 0)
			return 1;

		// Recursive step.
		return dealnnoy(m - 1, n) +
			dealnnoy(m - 1, n - 1) +
			dealnnoy(m, n - 1);
	}
	
	// driver function
	public static void main(String args[]){
		int n = 3, m = 4;
		System.out.println(dealnnoy(n, m));
	}
}

/* This code is contributed by Sagar Shukla. */
