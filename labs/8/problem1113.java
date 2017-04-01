import java.util.ArrayList;
import java.util.Scanner;
public class problem1113 {
	
	public static void main(String[] args) {
	
		ArrayList list = new ArrayList();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter ten integers: ");
		
		for(int x = 0; x<10; x++) { 
			list.add(scanner.nextInt());
		}
		
		removeDuplicate(list);
		
		System.out.print("The distinct integers are: ");
		
		for (int x = 0; x<list.size();x++) {
			System.out.print(list.get(x)+ " ");
		}
	}
	
	// JA: A better strategy is to recreate the arraylist without the duplicates
	// JA: The logic below doesn't remove more than two duplicates in sequence
	public static void removeDuplicate(ArrayList list) {
		
		for (int x = 0; x<list.size()-1;x++) {
		
			for(int i = x+1; i<list.size(); i++) {
			
				if(list.get(x) == list.get(i)) {
					list.remove(i);
				}
			}
		}
	}



}
