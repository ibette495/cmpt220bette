import java.util.Scanner;

public class problem618 {
	private static final int PASSWORD_REQUIRED_LENGTH = 8;
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your Password: ");
	String pass = input.nextLine();
	
	if (isValidPassword(pass)){
		System.out.println(pass + " is valid.");
	}
	else{
		System.out.println(pass + " is not valid.");
	}
	}
	public static boolean isValidPassword(String password){
		
		if(password.length() < PASSWORD_REQUIRED_LENGTH){
			return false;
		}
		
		int charCount = 0;
		int numCount = 0;
		for(int i = 0; i < password.length(); i++){
			char ch = password.charAt(i);
			
			if ( isNumeric(ch)) numCount++;
			else if(isLetter(ch)) charCount++;
			else return false;
		}
		return (charCount >= 2 && numCount >= 2);
	}
	public static boolean isLetter(char ch){
		ch = Character.toUpperCase(ch);
		return(ch >= 'A' && ch <='Z');
	}
	public static boolean isNumeric(char ch){
		return (ch >= '0' && ch<= '9');
	}
}



