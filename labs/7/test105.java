import java.util.Scanner;
public class test105 {
	public static void main(String[] args) {
		
				problem105 df = new problem105();
				
				int count = 0;
				
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Please Enter an Integer: ");
				
				int num = scan.nextInt();
				
				System.out.println("The prime factors for the given number " + num + " is");
				
				int factor = 2;
				
				while (factor <= num) {
					if (num % factor == 0) {
						num = num / factor;
						df.push(factor);
						count++;
					} else {
						factor++;
					}
				}
				for (int x = 0; x<=count; x++)
					System.out.print(df.pop()+" ");

			}

}
