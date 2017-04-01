import java.util.Scanner;
public class extendsTriangle {
	private double side1;
	
	private double side2;
	
	private double side3;

	public static void main(String[] args) {
		
		double s1,s2,s3;
		
		String color;
		
		boolean fill;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter color: ");
		
		color = input.nextLine();
		
		System.out.println("Enter sides: ");
		s1 = input.nextDouble();
		s2 = input.nextDouble();
		s3 = input.nextDouble();
		
		System.out.println("Fill triangle or not: ");
		
		fill = input.nextBoolean();
		
		extendsTriangle tt = new extendsTriangle (s1,s2,s3);
		
		tt.putcolor(color);
		tt.setFill(fill);
		
		System.out.println("Sides of "+ tt.toString());
		
		System.out.println("The Area of Triangle is "+tt.getarea());
		
		System.out.println("The Perimeter of Triangle is" +tt.getperimeter());
		
		System.out.println("The color of the Triangle is "+ tt.getColor());
		
		System.out.println("is Triangle filles " +tt.isFilled());
		
	}
	
	private String isFilled() {
		// TODO Auto-generated method stub
		return null; // JA: ?
	}

	private String getColor() {
		// TODO Auto-generated method stub
		return null; // JA: ?
	}

	private void setFill(boolean fill) {
		// TODO Auto-generated method stub
		
	}

	private void putcolor(String color) {
		// TODO Auto-generated method stub
		
	}

	public extendsTriangle (double s1, double s2, double s3) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	
	public double getside1() {
		return side1;
	}
	
	public double getside2() {
		return side2;
	}
	
	public double getside3() {
		return side3;
	}
	
	public double getarea() {
	
		double s = (side1+side2+side3)/2;
		
		double area = s*(s-side1)*(s-side2)*(s-side3);
		
		return area;
	}
	
	public double getperimeter() {
		return (side1+side2+side3);
	}
	
	public String toString() {
		return "Triangle: side1="+side1+" side2= "+side2+ "side3=" +side3;
	
	}



}
