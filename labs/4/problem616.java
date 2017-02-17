
public class problem616 {
	public static void main(String[] args) {
		int x = 2016;
		if(numberOfDaysInAYear(x) == true){
			System.out.println(x + " has 366 days!" );
		}else{
			System.out.println(x + " has 365 days!");
		}
		// JA: You had to write a loop from 2000 to 2020 and print each year
	}
	public static boolean numberOfDaysInAYear(int days){
		return days % 400 == 0 || (days % 4 == 0 && days % 100 != 0);
	}

}
