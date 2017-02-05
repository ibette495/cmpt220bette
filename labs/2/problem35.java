import java.util.Scanner;

public class problem35 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter todays day: ");
	
		int day = input.nextInt();
		
		System.out.print("Enter the number of days passed since today: ");
		
		int futureday = input.nextInt();
		
		
		
		switch (day % 7){ // JA: You don't need to use the % operator here because the value should be between 0 and 6
		case 0: System.out.println("Today is Sunday"); break;
		case 1: System.out.println("Today is Monday"); break;
		case 2: System.out.println("Today is Tuesday"); break;
		case 3: System.out.println("Today is Wednsay"); break;
		case 4: System.out.println("Today is Thursday"); break;
		case 5: System.out.println("Today is Friday"); break;
		case 6: System.out.println("Today is Saturday"); break;
		
		}
		switch (futureday + day % 7){
		case 0: System.out.println("The future day is Sunday"); break;
		case 1: System.out.println("The future day is Monday"); break;
		case 2: System.out.println("The future day is Tuesday"); break;
		case 3: System.out.println("The future day is Wednsay"); break;
		case 4: System.out.println("The future day is Thursday"); break;
		case 5: System.out.println("The future day is Friday"); break;
		case 6: System.out.println("The future day is Saturday"); break;
		
		
	}
	
	}
}
