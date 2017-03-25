// JA: You missed the overlap method.
class Circle2D {
	
	double x;
	
	double y;
	
	double radius;
	
	final double PI=3.14;
	
	public Circle2D() {
		
		x=0;
		
		y=0;
		
		radius=1;
	}
	public Circle2D(double x, double y, double r) {
		this.x=x;
		this.y=y;
		this.radius=r;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius; // JA: This is more precise
	}
	
	public double getPerimeter() {
		return 2*Math.PI*radius;  // JA: This is more precise
	}
	
	public double getDistance(double otherX, double otherY) {
		return Math.sqrt((otherX-x)*(otherX-x) +
				(otherY-y) * (otherY-y));
	}
	
	public boolean contains(double otherX, double otherY) {
		if (getDistance(otherX, otherY) < this.radius)
			return true;
		else
			return false;
	}
	
	public boolean contains(Circle2D circle) {
		if(this.radius < getDistance(circle.x, circle.y)
				&& circle.radius > getDistance(circle.x, circle.y)) 
			return true;
		else
			return false;
	}
}


