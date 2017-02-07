import java.util.Scanner;


public class prob51 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		boolean dataBool = true;
		
		System.out.print(
				"Enter and integer  (the input ends if it is 0): ");
		int data = input.nextInt();
		
		if (data == 0){
			dataBool = false;
		}
		
		while(dataBool){
			if(data % 2 == 1){
				System.out.print("THIS IS ODD");
			}
			else{
				System.out.print("THIS IS EVEN");
			}
		
		}
	}
}

