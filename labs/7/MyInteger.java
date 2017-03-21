import java.util.Scanner;
	class MyInteger {
		int values;
		
		MyInteger(int num) {
			values = num;
		}
		
		public int getValue() {
			return values;
		}
		
		public static boolean isEven(int i) {
			return (i%2 == 0); 
		}
		public static boolean isOdd(int i) {
			return !isEven(i);
		}
		public static boolean isPrime(int i) {
			for (int x = 2; x < i / 2; x++) {
				if(i % x == 0) {
					return false;
				}
			}
			return true;
		}
		
		public static boolean isEven(MyInteger i) {
			return i.isEven();
		}
		
		public static boolean isOdd(MyInteger i) {
			return i.isOdd(); 
		}
		
		public boolean isPrime(MyInteger i) {
			return i.isPrime();
		}
		
		public boolean isEven() {
			return isEven(values);
		}
		
		public boolean isOdd() {
			return isOdd(values);
		}
		
		public boolean isPrime() {
			return isPrime(values);
		}
		
		public boolean equals(int i) {
			return (values == i);
		}
		
		public boolean equals(MyInteger i) {
			return equals(i.getValue());
		}
		
		public static int parseInt(String s) {
			return Integer.parseInt(s);
		}
		
		public static int parseInt(char[] s) {
			return parseInt(new String(s));
		}
		
	}

