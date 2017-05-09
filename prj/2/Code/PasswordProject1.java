//This is my password strength generater, each password must be longer than 13 characters and have 
//3 digits in them for them to be considered strong
import java.util.Scanner;
public class PasswordProject1 {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		
		
		System.out.println("PLease enter the password you want to set for this account!");
		
		System.out.println("Your password must be longer than 12 charecters, must cotain 1 capital letter, and at least 3 digits: ");
		
		String userPassword = userInput.next();
		
		
		
		if (isStrong(userPassword)){
			System.out.println("This password is strong enough. ");
			
		}
		
		else{
			System.out.println("this password is not strong enough. ");
			
	}			
		
	}

	public static boolean isStrong(String userPassword){
		
		if (userPassword.length() < 12){
			System.out.print("The password entered is not long enough, ");
			return false;
		}
		
		else if (userPassword.equals("Qwerty123456789")){
			System.out.print("Password is too common, ");
			return false;
		
		}
		
		else if (userPassword.equals("Password1234")){
			System.out.print("Password is too common, ");
			return false;
		}
		
		else if (userPassword.equals("Asdfzxcv1234")){
			System.out.print("Password is too common, ");
			return false;
		}
		
		else if (userPassword.equals("123456789ABC")){
			System.out.print("Password is too common, ");
			return false;
		}
		
		else if (userPassword.equals("Letmein12345")){
			System.out.print("Password is too common, ");
			return false;
		}
		
		
		else{
			
			char i;
			
			int upperCase = 0;
		
			int digits = 0;
			
			for (int x = 0; x < userPassword.length(); x++){
				i = userPassword.charAt(x);
			
				if(Character.isUpperCase(i)){
	                upperCase++;
	            }
		
				if (!Character.isLetterOrDigit(i)){
					System.out.print("Characters entered are not valid characters, ");
					return false;
					
				}
				
				
				else if (Character.isDigit(i)){
					digits++;
				}
			}
			
			if (digits < 3){
				System.out.print("Not enough digits in your password, ");
				return false;
				
			}
			
			if (upperCase < 1){
            
				System.out.print("No capitail letters in the entered password, ");
            	return false;
			}
			
				
			}
			
		
			return true;
	}
}
