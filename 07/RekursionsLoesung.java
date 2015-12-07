public class EulersNumber {

	public static void main(String[] args) {
		System.out.println(String.valueOf(
				calculateEuler( Integer.parseInt(args[0]) ))
				);
	}
	
	/**
	 * Calculates the approximation of Euler's number
	 * @param n The upper bound of the sum
	 * @return The approximation
	 */
	private static double calculateEuler(int n){
		if(n < 0) return 0;
		return 1 / (double)calculateFactorial(n) + calculateEuler(n-1);
	}
	
	/**
	 * Calculate the factorial of the passed value
	 * @param k The value to calculate the factorial of
	 * @return The factorial of k
	 */
	private static int calculateFactorial(int k){
		int res = 1;
		for(int i = 1; i <= k; i++)
			res *= i;
		return res;
	}

}