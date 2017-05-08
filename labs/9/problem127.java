import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem127 {
	public static void main(String[] args) throws IOException{
		try {
		
			BufferedReader bf = new BufferedReader (new
		
					InputStreamReader(System.in));
		
			System.out.print("Please enter the binary values: ");
		
			String str = bf.readLine();
		
			int x = binaryToDecimal(str);
		
			System.out.println("Decimal := "+ x);
		}
		
		catch(NumberFormatException ex) {
		
			System.out.println("Number Format Exception occured.program will exit");
		
			System.out.println(ex.getMessage());
		
			System.exit(0);
		}
		}
		
	public static int binaryToDecimal(String binaryString) {
		
		int decimalValue = 0;
		
		for(int x = 0; x < binaryString.length(); x++) {
		
			Character binaryChar = binaryString.charAt(x);
		
			String tempStr = binaryChar.toString();
		
			int tempInt = Integer.parseInt(tempStr);
		
			if(tempInt !=0 && tempInt !=1) {
		
				System.out.println("Invalid binary number entered. Program will exit. ");
		
				System.exit(0);
		}
		
			decimalValue = decimalValue * 2 + tempInt;
		}
		
		return decimalValue;	
	}
}