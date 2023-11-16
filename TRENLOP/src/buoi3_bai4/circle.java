package buoi3_bai4;

public class circle extends shape{
	private double radius =1;

	public circle() {
	}

	public circle(double radius) {
		this.radius = radius;
	}

	public circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}
	public double dientich() {
		return Math.PI * Math.pow(radius, 2);
	}
	public double chuvi() {
		return 2 * Math.PI * this.radius;
	}
	public void nhap() {
		super.nhap();
		System.out.println("Nhap vao radius: " );
		this.radius = sc.nextDouble();
	}
	@Override
	public String toString() {
		return "Thong tin hinh tron: "+ super.toString()  + "|| ban kinh : " + this.radius ;
	}

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
