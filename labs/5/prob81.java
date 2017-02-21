import java.util.Scanner;
public class prob81 {
	public static void main(String[] args) {
		
		System.out.print("Enter a 3 by 4 matrix: ");
		
		Scanner input = new Scanner(System.in);

		double[][] matrix = new double[3][4];
		
		for (int x = 0; x < matrix.length; x++)
			for (int h = 0; h < matrix[x].length; h++){
				matrix[x][h] = input.nextDouble();
			}
		for (int x = 0; x < matrix[0].length; x++) {
			
			System.out.println("The sum of the doubles in column " + x +" is " + sumColumn(matrix, x));
		}

	}

	public static double sumColumn(double[][] m, int columnIndex) {
		double total = 0;

		for (int x = 0; x < m.length; x++) {
			total += m[x][columnIndex];
		}
		return total;
	}

	public static void Matrix(double[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {

			for (int column = 0; column < matrix[row].length; column++) {
				System.out.printf("%5.0f ", matrix[row][column]);
			}
		}
	}

}