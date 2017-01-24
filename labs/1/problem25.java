import java.util.Scanner;
public class problem25 {
 public static void main(String[] args) {
  System.out.println("Enter a subtotal and gratuity number");
  Scanner scanner = new Scanner(System.in);
  double x = scanner.nextDouble();
  double y = scanner.nextDouble();
  System.out.println(" The total is $" + (x+(y/10)) + " The gratuity is $" + y/10);
  
  
  
  
 }
}