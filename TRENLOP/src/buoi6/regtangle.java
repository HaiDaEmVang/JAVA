package buoi6;

public class regtangle extends shape{

	protected  double width;
	protected double height;
	
	
	public regtangle(String color, boolean fillter, double width, double height) {
		super(color, fillter);
		this.width = width;
		this.height = height;
	}
	public regtangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	public regtangle() {
		super();
		this.width = 0;
		this.height = 0;
	}
	
	@Override
	public double getArea() {
		return this.height * this.width;
	}

	@Override
	public double getPerimeter() {
		return (this.height + this.width)/2;
	}
	public void nhap() {
		super.nhap();
		System.out.println("Nhap vao chieu dai ");
		this.width = sc.nextDouble();
		sc.nextLine();
		System.out.println("Nhap vao chieu rong: ");
		this.height = sc.nextDouble();
		sc.nextLine();
	}
	public String toString() {
		return String.format(" %5.2f - %5.2f || %10.2f || %10.2f ||", this.width, this.height, this.getArea(), this.getPerimeter()) + super.toString();
	}
	
	public void superNhap() {
		super.nhap();
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}
