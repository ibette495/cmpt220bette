import java.util.ArrayList;
import java.util.Scanner;
public class problem1117 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter an integre m: ");
		
		
		int m = scanner.nextInt();
		
		ArrayList integerFactors = new ArrayList();
		
		computeIntegerFactors(m, integerFactors);
		getOddNumberedFactors(integerFactors);
		
		int smallestNum = 1;
		
		for(int x = 0; x<integerFactors.size();x++) {
			smallestNum = smallestNum * (int)integerFactors.get(x); // JA
		}
		
		System.out.println("The smallest number n for m *n to be a perfect square is "+ smallestNum);
		
		System.out.println("m * n is " +(m*smallestNum));
	}
	
	private static void computeIntegerFactors(int m, ArrayList integerFactors) {
			int factor = 2;
			while (factor <= m) {
				if (m % factor == 0)
				integerFactors.add(factor);
				m /= factor;
			} 
			{
				factor++;
			}
		}

	public static void getOddNumberedFactors(ArrayList list) {
		
		for (int x = 0; x<list.size()-1; x++) {
		
			for(int i = x+1; i<list.size(); i++) {
			
				if(list.get(i ) == list.get(i)) { // JA: list.get(i+1) ?
					list.remove(i);
					list.remove(x);
				}
			}
		}
		
	}
	
}
