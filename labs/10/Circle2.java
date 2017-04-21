
class Circle2 extends GeometricObject5 {
	
	public double radius;
	
	public Circle2(double rad) {
	
		this.radius = rad;
	}
	
	public double getPerimeter() {
		return Math.PI * radius * radius;
	}
	
	public double getArea() {
		return 2 * Math.PI * radius;
	}
	
	public boolean equals(Object object) {
		if (this.radius == ((Circle2)object).radius)
			return true;
		return false;
	}
}