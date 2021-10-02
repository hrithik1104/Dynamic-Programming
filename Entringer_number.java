// JAVA Code For Entringer Number
import java.util.*;

class GFG {
	
	// Return Entringer Number E(n, k)
	static int zigzag(int n, int k)
	{
		// Base Case
		if (n == 0 && k == 0)
			return 1;
	
		// Base Case
		if (k == 0)
			return 0;
	
		// Recursive step
		return zigzag(n, k - 1) +
			zigzag(n - 1, n - k);
	}
	
	/* Driver program to test above function */
	public static void main(String[] args)
	{
		int n = 4, k = 3;
		System.out.println(zigzag(n, k));
		
	}
}
