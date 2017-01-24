import java.util.Scanner;
public class problem26 {
 public static void main(String[] args) {
  System.out.println("Enter a number with 3 digits");
  
  Scanner scanner = new Scanner(System.in);
  
  int i = scanner.nextInt();
  int aa = i%10;
  int ab = (i/10)%10;
  int ac = i/100;
  
  System.out.println(aa + ab + ac);
 }
}
