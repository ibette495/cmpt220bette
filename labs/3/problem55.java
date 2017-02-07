import java.util.Scanner;
public class problem55 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Kilograms: Pounds");
		
		for(double weight = 0.0; weight <= 100; weight++){
			System.out.println(weight + "      :  " + (weight*2.2));
		}
		
	}

}
