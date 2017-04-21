
public class ColorableTest {
	
	public static void main(String[] args) {
	
		GeometricObject4[] object = new GeometricObject4[5];
		
		object[0] = new GeometricObject4();
		
		object[1] = new Square();
		
		object[2] = new Square();
		
		object[3] = new GeometricObject4();
		
		object[4] = new Square();
		
		for (int x = 0; x<object.length;x++) {
			GeometricObject4 obj = object[x];
			System.out.print("Object["+x+ "] ");
			
			if (obj instanceof Colorable) {
				Colorable colorable = (Colorable) obj;
				colorable.howToColor();
			
			} else {
				System.out.println("This is not colorable");
			}
		}
		
	}

}
