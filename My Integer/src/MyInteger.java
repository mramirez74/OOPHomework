public class MyInteger {

	public static boolean isEven(int n) {
		return (n % 2 == 0);
	}

	public static boolean isOdd(int n) {
		return (n % 2 != 0);
	}

	public static boolean isPrime(int n) {
		for (int j = 2; j < n / 2; j++) {
			if (n % j == 0) {
				return false;
			}
		}
		return true;
	}

}
