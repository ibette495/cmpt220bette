import java.util.Random;
import java.util.Scanner;
public class Prob123 {
	public static void main(String[] args) {
		final int SIZE = 100;
		
		Random rando = new Random();
		
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[SIZE];
		
		for(int x = 0; x < SIZE; x++) {
		
			arr[x] = 1+rando.nextInt(100);
		}
		
		System.out.print("Please enter the index of the array: ");
		
		int index = input.nextInt();
		
		try {
		
			int values = arr[index];
		System.out.println("The corresponding value at index " + index + " is " + values);
		}
		
		catch(ArrayIndexOutOfBoundsException ex) {
		
			System.out.println("This is out of bounds");
		}
	}
}