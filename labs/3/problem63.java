import java.util.*; // JA: It is not good practice to include the compete package.

// JA: This code does not compile
// JA: This is not the correct problem 6.3
public class problem63 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER IN A NUMBER YA GOOF!!!!!!: ");
		int nextNum = input.nextInt();
		int revNum = reverse(nextNum);
		System.out.println(revNum);
		
	
		
	}
	public static int reverse(int number){
		int size = String.valueOf(number).length();
		double limit = Math.pow(10,size);
		int output; // JA: You need to initialize this if you need to use it for a running quantity.
		for(int i=size; i>=1; i--){
			int digimon = number % 10;
			number /= 10;
			output = output + (int)Math.pow(digimon,i);	// JA: You are using output which was not initialized
		}
		return output;
				
		
		
	}
}
