
class MyString2 {
	private char[] chars;
	
	public MyString2(char[] chars) {
		this.chars = new char[chars.length];
		
		System.arraycopy(chars, 0, this.chars, 0, chars.length);
	}
	public int compare(MyString2 s) {
		return 1;
	}
	public MyString2 toUppercase() {
		
		char[] temp = new char[chars.length];
		
		for (int x = 0; x < chars.length; x++) {
		
			temp[x] = Character.toUpperCase(chars[x]);	
		}
		return new MyString2(temp);
	}
	public static MyString2 valueOf(boolean a) {
		
		if(a) 
			return new MyString2(new char[] {'t', 'r', 'u', 'e'});
		else
			
			return new MyString2(new char[] {'f', 'a', 'l', 's', 'e'});
	}
	public MyString2 substring(int begin) {
		
		char[]  temp = new char[chars.length - begin];
		
		for (int x = begin; x < chars.length; x++) {
			temp[x - begin] = chars[x];
		}
		return new MyString2(temp);
	}
	public char[] toChars() {
		return chars;
	}
}


