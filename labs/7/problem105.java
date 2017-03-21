import java.util.Scanner;
public class problem105 {
	private int[] x;
	
	private int myarray;
	
	public static final int arraysize = 16;
	
	public problem105() {
		this(arraysize);
	}
	public problem105(int capacity) {
		x = new int[capacity];
	}
	
	public int push(int num) {
		if(myarray >= x.length) {
			int[] i = new int[x.length * 2];
			System.arraycopy(x, 0, i, 0, x.length);
			x = i;
		}
		return x[myarray++] = num;
	}
	
	public int pop() {
		return x[--myarray];
	}
	
	public int peek() {
		return x[myarray - 1];
	}
	
	public boolean empty() {
		return myarray == 0;
	}
	
	public int getSize() {
		return myarray;
	}
}

