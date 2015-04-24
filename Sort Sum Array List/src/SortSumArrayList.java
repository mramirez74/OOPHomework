import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class SortSumArrayList {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> sortArray = new<Integer> ArrayList();
		
		for(int i = 0; i < 5; i++){
			
			System.out.println("Please enter a number:");
			sortArray.add(input.nextInt());
	
		}
		
		System.out.println("The numbers are:");
		
		for(int i = 0; i < sortArray.size(); i++){
			
			System.out.print(sortArray.get(i) + " ");
		}
		
		System.out.println("\nHere are the numbers sorted:");
		
		Collections.sort(sortArray);
		
		for(int counter: sortArray){
			
			System.out.print(counter + " ");
		}
		
		System.out.println("\nHere is the sum of the numbers: " + sum(sortArray));
	}
	
	public static int sum(ArrayList list){
		
		int sum = 0;
		
		for(int i = 0; i < list.size(); i++){
			
			sum = sum + ( (int) list.get(i));
		}
		return sum;
	}

}
