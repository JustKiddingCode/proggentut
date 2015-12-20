
public class UtilityClass {
  /**
   * @return The nth. fibonacci number
   * 
   */
  public static int fib(int n) {
	  if (n == 0) return 0;
	  if (n == 1) return 1;
	  return fib(n-1) + fib(n-2);
	  
  }
  
  public static double calcE(int n) {
	  long fak = 1;
	  double e = 1;
	  for(int i = 1; i <= n; i++){
		  fak *= i;
		  e += 1.0 / fak;
	  }
	  return e;
  }
}
