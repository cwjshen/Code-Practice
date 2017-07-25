public class FibonacciDP {

	public static Long[] memo;

	public static long fibRec(int n) {
		long fib_n;
		if (n < 0) {
			System.out.println("0 or greater please!");
			return -1;
		}
		if (n == 0) 
			return 0;
		if (n == 1) 
			return 1;
		else 
			fib_n =  fibRec(n-1) + fibRec(n-2);
			return fib_n;
	}

	public static long fibDP(int n) {
		long fib_n;
		if (memo[n] != null)
			return memo[n];

		if (n < 0) {
			System.out.println("0 or greater please!");
			return -1;
		}
		
		if (n == 0) 			
			return 0;		
		if (n == 1) 
			return 1;
			
		else {
			fib_n = fibDP(n-2) + fibDP(n-1);
			memo[n] = fib_n;
			return fib_n;
		} 

			
	}

	public static void main(String[] args) {
		int size = 1000;
		memo = new Long[size+1];

		// System.out.println("Recursive..." + fibRec(size));		
		System.out.println("Dynamic Programming..." + fibDP(size));
	}
}