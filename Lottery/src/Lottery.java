import java.util.Scanner;
import java.util.Random;

public class Lottery {

	public static void main(String[] args) {

		System.out.println("Enter a series of 5 numbers.");

		Scanner input = new Scanner(System.in);

		int[] guessArray = new int[5];

		int[] lotteryArray = new int[5];

		int count = 0;

		int n = 0;
		Random randomLottery = new Random();

		Input(guessArray, lotteryArray, n, input, randomLottery);
		lotteryNumbers(lotteryArray);
		for (int a = 0; a < guessArray.length; a++) {

			if (guessArray[a] == lotteryArray[a]) {

				count++;

			}
		}
		matchingNumbers(count, guessArray, lotteryArray);
	}

	public static void lotteryNumbers(int array[]) {

		System.out.println("The lottery numbers are: ");

		for (int j = 0; j < array.length; j++) {

			System.out.print(array[j] + " ");
		}

	}

	public static void matchingNumbers(int C, int array[], int Array[]) {
		System.out.println("\nYou matched " + C + " numbers.");

		System.out.println("The matching numbers are:");

		for (int a = 0; a < array.length; a++) {

			if (array[a] == Array[a]) {

				System.out.print(array[a] + " ");
			}
		}
	}

	public static void Input(int array[], int Array[], int c, Scanner Input,
			Random randomInput) {
		for (int i = 0; i < array.length; i++) {

			System.out.print("Enter number " + (i + 1) + ": ");

			array[i] = Input.nextInt();

			int c1 = randomInput.nextInt(10); // Assignment of random numbers
			Array[i] = c1; // 0-9 to another array
		}
	}
}
