import java.util.Scanner;
public class problem711 {
	static final int SIZE = 10;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double[] elements = new double[SIZE];
		
		System.out.print("Please enter in " + SIZE + " numbers: ");
		for (int x = 0; x < elements.length; x++) elements[x] = input.nextDouble();

		System.out.println("The mean is " + mean(elements));
		
		System.out.println("The standard deviation is " + standardDeviation(elements));

	}

	public static double standardDeviation(double[] x) {

		double theMean = mean(x);
		
		double deviation = 0;
		
		for (int j = 0; j < x.length; j++) {
			deviation += Math.pow(x[j] - theMean, 2);
		}
		return Math.sqrt(deviation / (x.length - 1));
	}
	public static double mean(double[] x) {

		double total = 0;
		
		for (int j = 0; j < x.length; j++) {
			total += x[j];
		}
		System.out.println(total);
		
		return total / x.length;

	}

}
