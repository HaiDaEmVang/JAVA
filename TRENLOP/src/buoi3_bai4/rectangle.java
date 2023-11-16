package buoi3_bai4;

public class rectangle extends shape{
	private double width = 1;
	private double length = 1;
	
	public rectangle() {
		super();
	}
	public rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	public rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	public double dientich() {
		return this.width * this.length;
	}
	public double chuvi() {
		return this.length * this.width * 0.5;
	}
	@Override
	public void nhap() {
		super.nhap();
		System.out.println("Nhap vao width: ");
		this.width = super.sc.nextDouble();
		System.out.println("Nhap vao length: " );
		this.length = super.sc.nextDouble();
	}
	@Override
	public String toString() {
		return "Thong tin hinh chu nhat: "+ super.toString() + "|| Chieu dai: " + this.width + "|| Chieu rong: " + this.length ;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
