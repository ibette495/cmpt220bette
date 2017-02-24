import java.util.Scanner;
public class problem714 {
	static final int SIZE = 5;

	public static void main(String[] args) {
		
		int[] elements = new int[SIZE];
		
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter in " + SIZE + " numbers to get their greatest common denominator: ");
		
		for (int x = 0; x < elements.length; x++) elements[x] = input.nextInt();

		System.out.println("The greatest common denominator is " + gcd(elements));

	}

	public static int gcd(int... elements) {
		
		int gcd = 0;
		
		int min = getMinimum(elements);
		
		int length = elements.length - 1;

		int count = 0;
		
		for (int x = 2; x <= min; x++) {

			for (int i = 0; i <= length; i++) {
				if (elements[i] % x == 0) {
					count++;
					if (count == length) gcd = x;
				}else {
					count = 0;
				}
			}
		}
		return gcd;
	}

	public static int getMinimum(int[] array) {
		
		int min = array[0];
		
		for (int x = 0; x < array.length; x++) {
			
			if (min > array[x]) {
				min = array[x];
			}
		}
		return min;

	}

}

