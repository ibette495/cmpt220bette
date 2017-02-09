import java.util.Scanner;


public class problem516 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER AN INTEGER!!!!!: ");
		int number = input.nextInt();
		
		// JA: When finding the smallest factors, you need to decompose the numbers
		// JA: For example, if the input is 340, you need to find the smallest number that is a factor 
		// JA: and divide by the number, i.e., 2 is a factor and now your number is 170. You keep doing that 
		// JA: until the number is 1. So the factors of 340 are 2,2,5,17.
		for(int i = 2; i < number; i++){
			if(number % i == 0){
				System.out.print(i + ", ");
			}
			
			
		}
	}

}
