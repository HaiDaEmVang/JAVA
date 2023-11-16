package buoi3;

public class Student extends Person{
	private String masv;
	private double dtb;
	private String email;
	
	public Student() {
		super();
	}
	public Student(String masv, double dtb, String email) {
		this.masv = masv;
		this.dtb = dtb;
		this.email = email;
	}
	public Student(String name, int gt, String diachi, time ngaysinh, String masv, double dtb, String email) {
		super(name, gt, diachi, ngaysinh);
		this.masv = masv;
		this.dtb = dtb;
		this.email = email;
	}
	
	public boolean checkHocBong() {
		 return (this.dtb > 8.5) ? true : false;
	}
	@Override
	public void nhap() {
		super.nhap();
		System.out.println("Nhap vao ma sinh vien: ");
		this.masv = super.sc.nextLine();
		System.out.println("Nhap vao dtb: ");
		this.dtb = super.sc.nextDouble();
		sc.nextLine();
		System.out.println("Nhap vao email: ");
		this.email = super.sc.nextLine();
	}
	@Override
	public String toString () {
		return super.toString() + " \nMa sinh vien: " + this.masv + "\nDtb: " + this.dtb + "\nEmail: " + this.email;
	}
}
