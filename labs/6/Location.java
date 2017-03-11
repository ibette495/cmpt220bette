import java.text.DecimalFormat;
import java.util.Scanner;
// JA: Always add comments to your code
public class Location {
	static double[][] myArray = null;
	
	public static int row = 0;
	
	public static int col = 0;
	
	public static double maxVal = 0;
	
	public static void main(String[] args) {
		
		System.out.print("Enter all the numbers of the rows and columns of your array: " );
		
		Scanner input = new Scanner(System.in);
		String sizeString = null;
		String arrayElem = null; 
		String[] temp1 = null;
		String[] temp2 = null;
		sizeString = input.nextLine();
		temp1 = sizeString.split(" ");
		if(temp1.length != 2) {
			
			System.out.println("Either the Row or the Column value was not entered correctly, this Program will now quit.");
			System.exit(0);			
		}
		for(int x = 0; x<temp1.length; x++) {
			if(Integer.parseInt(temp1[x]) <= 0 ) {
				System.out.println("The value entered for either the Colomn or the Row was negitive, this Program will not quit. ");
				System.exit(0);
			}
		}
		row = Integer.parseInt(temp1[0]);
		col = Integer.parseInt(temp1[1]);
		myArray = new double [row][col];
		
		System.out.println("Please enter your array: ");
		
		for(int x = 0; x<row; x++) {
			arrayElem = input.nextLine();
			temp2 = arrayElem.split(" ");
			if(temp2.length != col) {
				System.out.println("The number you entered in the array is invalid , this Program will now quit. ");
				System.exit(0);
			}
			for(int i = 0; i<col; i++) {
				myArray[x][i] = Double.parseDouble(temp2[i]);
			}
			arrayElem = null;
		}
		locateLargest(myArray);
	}
	public static Location locateLargest(double[][] a) {
		
		DecimalFormat df = new DecimalFormat("##.##");
		
		maxVal = a[1][1];
		int posX = 0;
		int posI = 0;
		for(int x = 0; x<row; x++) {
			for(int i = 0; i<row; i++) { // JA: i<col
				if(a[x][i] > maxVal) {
					maxVal = a[x][i];
					posX = x;
					posI = i;
				}
			}
		}
		System.out.println("The location of the largest element in the array is: " + df.format(maxVal) + " at " +
				" ("+posX +"," + posI +") ");
				return new Location();






}
}
