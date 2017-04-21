
abstract class GeometricObject6 {

	private String color = "White";
	
	private boolean filled;
	
	private java.util.Date dateCreated;
	
	protected GeometricObject6() {
		dateCreated = new java.util.Date();
	}
	
	protected GeometricObject6(String color, boolean filled) {
		dateCreated = new java.util.Date();
	
		this.color = color;
		
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setFilled(boolean filled) {
		this.filled =filled;
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	public String toString() {
		return "created on "+dateCreated+"\ncolor: "
				+color+" and filled: "+filled;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
}