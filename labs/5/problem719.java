import java.util.Scanner;
public class problem719 {
	static int size = 70;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter list (First number is the list size) \n");

		size = input.nextInt();
		
		int[] elements = new int[size];

		for (int x = 0; x < size; x++) {
			elements[x] = input.nextInt();
		}
		if (isSorted(elements)){
			System.out.print("This list is in order. ");
		}
		else{
			System.out.print("This list is not in order. ");
		}

	}

	public static boolean isSorted(int[] elements) {

		for (int x = 0; x < elements.length-1; x++) {

			if (elements[x] > elements[x + 1]){
				return false;
			}

		}
		return true;
	}
	public static void printArray(int[] array, int numPerLine) {

		for (int x = 0; x < array.length; x++) {

			System.out.printf("%4d ", array[x]);
			if ((x + 1) % numPerLine == 0){
				System.out.println("");
			}
		}

	}

}

