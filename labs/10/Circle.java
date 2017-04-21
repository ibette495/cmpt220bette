
class Circle extends GeometricObject{
	public double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getPerimeter() {
		return  Math.PI * 2 * radius;
	}
	
	public double getArea() {
		return Math.PI * (radius * radius);
	}
}

