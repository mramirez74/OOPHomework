import java.util.Scanner;

public class TestInteger {

	public static void main(String[] args) {

		System.out.print("Please enter an integer: ");
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		System.out.println("isEven: " +MyInteger.isEven(number));
		System.out.println("isOdd: " +MyInteger.isOdd(number));
		System.out.println("isPrime: " +MyInteger.isPrime(number));
		
	}

}
