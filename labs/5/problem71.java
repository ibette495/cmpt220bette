import java.util.Scanner;
public class problem71 {
	static final int SIZE = 10;

	public static void main(String[] args) {
		
		double[] elements = new double[SIZE];
		
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter in " + SIZE + " numbers: ");
		for (int x = 0; x < elements.length; x++) elements[x] = input.nextDouble();
		
		System.out.println("The index of the smallest number is: " + smallestIndex(elements));

	}

	public static double smallestIndex(double[] array) {

		int index = 0;
		
		double low = array[index];
		
		for (int x = 0; x < array.length; x++) {

			if (low > array[x]) {
				low = array[x];
				index = x;
			}
		}
		return index;

	}

}