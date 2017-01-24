import java.util.Scanner;
public class problem21 {
 public static void main(String[] args) {
  System.out.println("Enter the tempeture");
  Scanner scanner = new Scanner(System.in);
  double x = scanner.nextDouble();
  System.out.print(x + " Celsius is " + (x*9.0/5+32) + " Fahrenheit " );
  
 }
}