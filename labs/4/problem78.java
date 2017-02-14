import java.util.Scanner;
public class problem78 {
	static final int SIZE = 10;
	public static void main(String[] args) {
		double[] numbers = new double[SIZE];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 two digets numbers: ");
        for (int j = 0; j < numbers.length; j++) numbers[j] = input.nextDouble();

        System.out.println("The average value is : " + average(numbers));

    }

    public static int average(int[] array) {
        int tot = 0;
        for (int x = 0; x < array.length; x++) {
            tot += array[x];
        }
        return tot / array.length;
    }

    public static double average(double[] array) {
        double tot = 0;
        for (int x = 0; x < array.length; x++) {
            tot += array[x];
        }
        return tot / array.length;
    }

    public static void printArray(int[] array, int numberPerLine) {

        for (int x = 0; x < array.length; x++) {

            System.out.printf("%4d", array[x]);
            if ((x + 1) % numberPerLine == 0) System.out.println("");
        }
    }

	}

