import java.util.Scanner;

public class Distinct {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] distinctArray = new int[5];
		boolean[] storedArray = new boolean[5];

		for (int i = 0; i < distinctArray.length; i++) {

			System.out.print("Enter integer " + (i + 1) + ": ");
			distinctArray[i] = input.nextInt();
			storedArray[i] = true;
			
			for (int j = 0; j < distinctArray.length; j++) {

				if (distinctArray[i] == distinctArray[j] && i != j) {

					storedArray[i] = false;
				}

			}
		}

		System.out.println("\nDistinct numbers are: ");

		for (int i = 0; i < 5; i++) {
			if (storedArray[i])
				System.out.print(distinctArray[i] + " ");
		}

	}

}
