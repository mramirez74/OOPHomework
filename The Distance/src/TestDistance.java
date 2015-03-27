import java.util.Scanner;

public class TestDistance {

	public static void main(String[] args) {
		
		System.out.print("x1: ");
		
		Scanner input = new Scanner(System.in);
		double x1 = input.nextDouble();
		
		System.out.print("x2: ");
		double x2 = input.nextDouble();
		
		System.out.print("y1: ");
		double y1 = input.nextDouble();
		
		System.out.print("y2: ");
		double y2 = input.nextDouble();
		
		System.out.println("The x-distance is: " +TheDistance.getxDistance(x1, x2));
		System.out.println("The y-distance is: " +TheDistance.getyDistance(y1, y2));
		
		System.out.println("The total distance is: " +TheDistance.totalDistance());



		
		
		
		
	}

}
