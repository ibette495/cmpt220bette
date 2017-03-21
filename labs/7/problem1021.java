import java.math.BigInteger;
public class problem1021 {
	public static void main(String[] args) {
		
		BigInteger longValues = new
				BigInteger(Long.MAX_VALUE+"");
		
		int values = 1;
		
		longValues = longValues.add(new BigInteger("1"));
		
		System.out.println("The first ten numbers greater than Long.MAX_VALUE and divisible by 5 or 6 are\n");
		
		while (values <= 10) {
			if (longValues.remainder(new BigInteger("5"))
					.equals(BigInteger.ZERO) || longValues
					.remainder(new BigInteger("6"))
					.equals(BigInteger.ZERO)) {
				
				System.out.println(longValues);
				
				values++;
			}
			
			longValues = longValues.add(new BigInteger("1"));
		}

	}

}


