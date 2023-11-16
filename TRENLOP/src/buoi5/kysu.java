package buoi5;

public class kysu extends Canbo{
	private String nganhdt;
	
	public kysu() {
	}
	public kysu(String nganhdt) {
		super();
		this.nganhdt = nganhdt;
	}
	
	public void nhap() {
		super.nhap();
		System.out.println("Nhap vao nganh dao tao: ");
		this.nganhdt = sc.nextLine();
	}
	public String toString() {
		return super.toString()+ String.format("|| %15s || %s", "Ky su", this.nganhdt); 
	}
	public String getNganhdt() {
		return nganhdt;
	}
	public void setNganhdt(String nganhdt) {
		this.nganhdt = nganhdt;
	}
	
}
