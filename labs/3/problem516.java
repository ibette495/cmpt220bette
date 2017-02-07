import java.util.Scanner;
public class problem516 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER AN INTEGER!!!!!: ");
		int number = input.nextInt();
		
		for(int i = 2; i < number; i++){
			if(number % i == 0){
				System.out.print(i + ", ");
			}
			
			
		}
	}

}
