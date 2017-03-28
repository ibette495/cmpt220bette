import java.util.ArrayList;
import java.util.Scanner;
public class problem1111 {
	
	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Scanner input = new Scanner (System.in);
		
		
		System.out.print("Please enter 5 numbers: ");
		
		int x = 0;
		
		while (x < 5) {
			list.add(input.nextInt());
			x++;
		}
		sort(list);
		
		System.out.print("This is the list after sorting: ");
		
		for(int i = 0; i<list.size(); i++)
			System.out.print(list.get(i)+" ");
	}
	
	public static void sort (ArrayList<Integer> list) {
		
		int temp;
		
		for(int x = 0; x<list.size(); x++) {
			
			for(int i = x+1; i<list.size()-1; i++) {
				
				if(list.get(x)>list.get(i)) {
					temp=list.get(x);
					list.set(x, list.get(i));
					list.set(i, temp);
				}
			}
		}
	}

}

