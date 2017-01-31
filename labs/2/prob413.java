import java.util.Scanner;
public class prob413 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		
		char check = input.next().charAt(0);
		if(check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u'){
			System.out.println(check + " is a vowel ");
		}
		else if ((int)check > 65 && (int)check < 91 || (int)check > 96 && (int)check < 122){
			System.out.println(check + " is a consonant ");
		}
		else{
			System.out.println(check + " is invalid ");
		}
		
	}
}

