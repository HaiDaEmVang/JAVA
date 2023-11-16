package buoi6;

public class circle extends shape{
	protected double radius;

	public circle(String color, boolean fillter, double radius) {
		super(color, fillter);
		this.radius = radius;
	}
	public circle(double radius) {
		super();
		this.radius = radius;
	}
	public circle() {
		super();
		this.radius = 0;
	}
	@Override
	public double getArea() {
		return 2*Math.PI*this.radius;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius, 2);
	}
	
	public String toString() {
		return String.format(" %13.2f || %10.2f || %10.2f ||", this.radius, this.getArea(), this.getPerimeter()) + super.toString();
	}
	public void nhap() {
		super.nhap();
		System.out.println("Nhap vao ban kinh: ");
		this.radius = sc.nextDouble();
		sc.nextLine();
	}
}
