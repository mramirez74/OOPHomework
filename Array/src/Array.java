import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		System.out
				.println("This program will find the highest, lowest, average, and the sum of the numbers that you "
						+ "will enter.");

		Scanner input = new Scanner(System.in);

		System.out.println("How many numbers do you want to enter?");
		int number = input.nextInt();

		double[] array = new double[number];

		for (int i = 0; i < number; i++) {

			System.out.print("Enter number " + (i + 1) + ": ");

			array[i] = input.nextInt();
		}
		
		showHighest(array);
		showLowest(array);
		showTotal(array);
		showAverage(array);

	}

	public static void showHighest(double[] Array) {

		double highest = Array[0];

		for (int j = 1; j < Array.length; j++) {

			if (Array[j] > highest)
				highest = Array[j];

		}
		System.out.println("Highest Element is: " +highest);
		
	}
	
	public static void showLowest(double[] Array) {

		double lowest = Array[0];

		for (int j = 1; j < Array.length; j++) {

			if (Array[j] < lowest)
				lowest = Array[j];

		}
		System.out.println("Lowest Element is: " +lowest);
		
	}
	
	public static void showTotal(double[] Array) {

		double sum = 0;

		for (int j = 0; j < Array.length; j++) {

			sum += Array[j];
		}
		System.out.println("The sum of the Elements is: " +sum);
		
	}
	
	public static void showAverage(double[] Array) {

		double sum = 0;
		double average = 0;

		for (int j = 0; j < Array.length; j++) {

			sum += Array[j];
			average = sum / Array.length;

		}
		System.out.println("The average is: " +average);
		
	}

}
