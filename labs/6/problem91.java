import java.text.DecimalFormat;

public class problem91 {
	public static void main(String[] args){ 
		
		Rectangle rectangle1 = new Rectangle(4, 40);
		Rectangle rectangle2 = new Rectangle(3.5, 39.5);
		DecimalFormat df = new DecimalFormat("##.##");
		
		System.out.println("The Details of the first Rectangle are: ");
		System.out.println("The Width of Rectangle 1 is " + rectangle1.width );
		System.out.println("The Height of Rectangle 1 is " + rectangle1.height );
		System.out.println("The Area of Rectangle 1 is " + df.format(rectangle1.getArea()));
		System.out.println("The Area of Rectangle 1 is " + rectangle1.getPerimeter());
		System.out.println();
		
		
		System.out.println("The Details of the second Rectangle are: ");
		System.out.println("The Width of Rectangle 2 is " + rectangle2.width );
		System.out.println("The Height of Rectangle 2 is " + rectangle2.height );
		System.out.println("The Area of Rectangle 2 is " + df.format(rectangle2.getArea()));
		System.out.println("The Area of Rectangle 2 is " + rectangle2.getPerimeter());
		
		
	}

}
