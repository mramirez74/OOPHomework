public class TheDistance {

	public static double xDistance;
	public static double yDistance;

	public static double getxDistance(double x1, double x2) {
		xDistance = x2 - x1;
		
		return xDistance;
	}

	public static double getyDistance(double y1, double y2) {
		yDistance = y2 - y1;

		return yDistance;
	}

	public static double totalDistance() {
		double totalDistance = Math.sqrt((Math.pow(xDistance, 2))
				+ (Math.pow(yDistance, 2)));

		return totalDistance;
	}

}
