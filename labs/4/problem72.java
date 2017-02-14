import java.util.Scanner;
public class problem72 {
	public static void main(String[] args) {
		int[] nums = new int[10];
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter any 10 integers : ");
		for(int x = 0; x < 10; x++){
			nums[x] = input.nextInt();
		}
		for(int x = 9; x >= 0; x--){
			System.out.println(nums[x]);
		}
	}

}



