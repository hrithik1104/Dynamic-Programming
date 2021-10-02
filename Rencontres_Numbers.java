// Recursive Java program to find n-th Rencontres
// Number
import java.io.*;

class GFG {
	
	// Returns value of Binomial Coefficient
	// C(n, k)
	static int binomialCoeff(int n, int k)
	{
		
		// Base Cases
		if (k == 0 || k == n)
			return 1;

		// Recurrence relation
		return binomialCoeff(n - 1, k - 1) +
						binomialCoeff(n - 1, k);
	}

	// Return Recontres number D(n, m)
	static int RencontresNumber(int n, int m)
	{
		
		// base condition
		if (n == 0 && m == 0)
			return 1;

		// base condition
		if (n == 1 && m == 0)
			return 0;

		// base condition
		if (m == 0)
			return (n - 1) * (RencontresNumber(n - 1, 0)
						+ RencontresNumber(n - 2, 0));

		return binomialCoeff(n, m) *
							RencontresNumber(n - m, 0);
	}

	// Driver Program
	public static void main(String[] args)
	{
		int n = 7, m = 2;
		System.out.println(RencontresNumber(n, m));
	}
}

// This code is contributed by vt_m.
