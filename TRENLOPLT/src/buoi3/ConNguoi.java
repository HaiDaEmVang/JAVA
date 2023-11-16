package buoi3;
public class ConNguoi {
	protected String hoTen;
	protected int namSinh;
	public ConNguoi(String name,int nam) {
		setHoTen(name);
		setNamSinh(nam);
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public void ngu() {
		System.out.println("Kho Kho");
	}
	public void an() {
		System.out.println("an cuc");
	}
}
