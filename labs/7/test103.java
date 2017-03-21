import java.util.Scanner;
public class test103 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int a = input.nextInt();
		
		MyInteger c1 = new MyInteger(a);
		
		System.out.println(a + " is even? " + c1.isEven());
		
		System.out.println(a + " is odd? " + c1.isOdd());
		
		System.out.println(a + " is Prime? " + c1.isPrime());
		
		System.out.println("17 is Prime? "+ MyInteger.isPrime(7));
		
		char[] w= {'1','2','3','4'};
		
		System.out.println("Charecters " + MyInteger.parseInt(w));
		
		String s = "123456789";
		
		System.out.println("String is " + MyInteger.parseInt(s));
		
		System.out.println("19 is odd " + MyInteger.isOdd(19));
		
		System.out.println("10 is even? " + MyInteger.isEven(10));
		
		System.out.println(a+ " is equal to 24? " + c1.equals(24));

	}

}
	
