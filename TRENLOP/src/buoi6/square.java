package buoi6;

public class square extends regtangle{
	public square(String color, boolean filler, double size) {
		super(color, filler, size, size);
	}
	public square(double size) {
		super(size, size);
	}
	public square() {
		super();
	}
	
	public void setSize(double sizeNew) {
		super.width = super.height = sizeNew;
	}
	public double setSize() {
		return super.width;
	}
	public String toString() {
		return super.toString();
	}
	public void nhap() {
		super.superNhap();
		System.out.println("Nhap vao do dai canh: ");
		this.width = this.height = sc.nextDouble();
		sc.nextLine();
	}
}
