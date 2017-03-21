
public class test1011 {
	public static void main(String[] args) {
		
				Circle2D p1= new Circle2D(2,2,5.5);
				
				System.out.println("Area of a circle: "
						+ p1.getArea());
				
				System.out.println("Perimeter of a circle: "
						+ p1.getPerimeter());
				
				System.out.println("The point (3,3) lies in p1: "
						+ p1.contains(3,3));
				
				Circle2D p2 = new Circle2D(4,5,10.5);
				
				System.out.println("circle, p1 Contains circle, p2: "
						+p1.contains(p2));
				
				Circle2D p3 = new Circle2D(3,5,3.5);
				
				System.out.println("circle, p3 overlaps with circle, p3: "
						+p1.contains(p3));

			}
		

	}

