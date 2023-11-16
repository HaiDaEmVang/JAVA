package buoi5;

public class Nhanvien  extends Canbo{
	private String congviec;

	public Nhanvien() {
	}
	public Nhanvien(String name, int tuoi, int gt, String diachi, String congviec) {
		super(name, tuoi, gt, diachi);
		this.congviec = congviec;
	}
	public void nhap() {
		super.nhap();
		System.out.println("Nhap vao cong viec: ");
		this.congviec = sc.nextLine();
	}
	public String toString() {
		return super.toString() + String.format("|| %15s || %s", "Nhan vien", this.congviec); 
	}
	public String getCongviec() {
		return congviec;
	}
	public void setCongviec(String congviec) {
		this.congviec = congviec;
	}
}
