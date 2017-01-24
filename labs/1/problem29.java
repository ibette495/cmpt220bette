import java.util.Scanner;
public class problem29 {
 public static void main(String[] args) {
	 System.out.println("Enter in three diffrent numbers for your starting velocity, ending velocity, and time span");
	 Scanner scanner = new Scanner(System.in);
	 
	 double v0 = scanner.nextDouble();
	 double v1 = scanner.nextDouble();
	 double t = scanner.nextDouble();
	 
	 System.out.println("The accelaration is " + (v1-v0)/t);
  
 }
}
