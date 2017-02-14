
public class problem616 {
	public static void main(String[] args) {
		int x = 2016;
		if(numberOfDaysInAYear(x) == true){
			System.out.println(x + " has 366 days!" );
		}else{
			System.out.println(x + " has 365 days!");
		}
	}
	public static boolean numberOfDaysInAYear(int days){
		return days % 400 == 0 || (days % 4 == 0 && days % 100 != 0);
	}

}
