import java.util.Scanner;

public class problem32 {
public static void main(String[] args){
	int number1 = (int)(Math.random()*10); //Generate number1
	int number2 = (int)(Math.random()*10); //Generate number2
	int number3 = (int)(Math.random()*10); //generate number3
	
	Scanner input = new Scanner(System.in);
	
	System.out.print(
			"What is " + number1 + " + " + number2 + " + " + number3 + "? ");
	
	int answer = input.nextInt();
			System.out.println(number1 + " + " + number2 + " + " + number3 + " is " + (number1 + number2 + number3 == answer));
		
}
}
