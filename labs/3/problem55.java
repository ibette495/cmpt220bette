import java.util.Scanner;

// JA: Add comments to your code
// JA: 1 Kilogram = 2.20462 Pound
// JA: 1 Pound = 0.453592 Kilogram
// JA: There were two tables side by side, one kilograms to pounds, in increments of 2
// JA: the other pounds to kilograms in increments of 5
public class problem55 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Kilograms: Pounds");
		
		for(double weight = 0.0; weight <= 100; weight++){
			System.out.println(weight + "      :  " + (weight*2.2));
		}
		
	}

}
