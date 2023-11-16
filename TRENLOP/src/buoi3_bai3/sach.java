package buoi3_bai3;

public class sach extends taiLieu{
	private String  tenTG;
	private int soTrang;
	private int thangPhatHanh;
	public sach() {
	}
	public sach(String tenTG, int soTrang, int thangPhatHanh) {
		super();
		this.tenTG = tenTG;
		this.soTrang = soTrang;
		this.thangPhatHanh = thangPhatHanh;
	}
	public sach(String maTL, String tenTL, String tenNSX, int soPH, String tenTG, int soTrang, int thangPhatHanh) {
		super(maTL, tenTL, tenNSX, soPH);
		this.tenTG = tenTG;
		this.soTrang = soTrang;
		this.thangPhatHanh = thangPhatHanh;
	}
	@Override
	public void nhap() {
		super.nhap();
		sc.nextLine();
		do {
			System.out.println("Nhap vao ten tac gia: ");
			this.tenTG = sc.nextLine();
		}while(this.tenTG.length()>20);
		do {
			System.out.println("Nhap vao so trang: ");
			this.soTrang = sc.nextInt();
		}while(this.soTrang <=0);
		do {
			System.out.println("Nhap vao thang phat hanh: ");
			this.thangPhatHanh = sc.nextInt();
		}while(this.thangPhatHanh < 1 || this.thangPhatHanh >12);
		
	}
	public boolean search(int a) {
		return (a == super.getSoPH())? true: false;
	}
	@Override
	public String toString() {
		return super.toString() + " Ten tac gia: " + this.tenTG + " so trang: " + this.soTrang + " Thang phat hang: " + this.thangPhatHanh ;
	}
	
	public String getTenTG() {
		return tenTG;
	}
	public void setTenTG(String tenTG) {
		this.tenTG = tenTG;
	}
	public int getSoTrang() {
		return soTrang;
	}
	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	public int getThangPhatHanh() {
		return thangPhatHanh;
	}
	public void setThangPhatHanh(int thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}
	
	
	
}
