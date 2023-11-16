package buoi5;

public class Congnhan  extends Canbo{
	private int bac;
	public Congnhan() {
	}
	public Congnhan(String name, int tuoi, int gt, String diachi, int bac) {
		super(name, tuoi, gt, diachi);
		this.bac = bac;
	}
	
	public void nhap() {
		super.nhap();
		do {
			System.out.println("Nhap vao bac: ");
			this.bac = sc.nextInt();
		}while(this.bac < 0 || this.bac > 10);
	}
	public String toString() {
		return super.toString() + String.format("|| %15s || %d", "Cong nhan", this.bac); 
	}
	public int getBac() {
		return bac;
	}
	public void setBac(int bac) {
		this.bac = bac;
	}
}
