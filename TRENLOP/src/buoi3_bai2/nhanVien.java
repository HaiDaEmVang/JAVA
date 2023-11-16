package buoi3_bai2;

public class nhanVien extends canBo {
	private int tuoi;
	private int luong;
	private String email;
	
	
	public nhanVien() {
	}
	public nhanVien(int tuoi, int luong, String email) {
		super.nhap();
		this.tuoi = tuoi;
		this.luong = luong;
		this.email = email;
	}
	public nhanVien(String ten, int gt, String diaChi, String sdt, int tuoi, int luong, String email) {
		super(ten, gt, diaChi, sdt);
		this.tuoi = tuoi;
		this.luong = luong;
		this.email = email;
	}
	
	@Override
	public void nhap() {
		super.nhap();
		do {
			System.out.println("Nhap vao tuoi(20 - 60): ");
			this.tuoi = super.sc.nextInt();
		}while(this.tuoi < 20 || this.tuoi > 60);
		do {
			System.out.println("Nhap vao luong(1 - 5): ");
			this.luong = super.sc.nextInt();
		}while(this.luong < 1  || this.luong > 5);
		super.sc.nextLine();
		do {
			System.out.println("Nhap vao email: ");
			this.email = super.sc.nextLine();
		}while(this.email.contains("@") == false || this.email.contains("\s") == true);
		
	}
	public String toString() {
		return super.toString() + "\nTuoi: " + this.tuoi + "\nLuong: " +  this.luong + "\nEmail: " + this.email;
	}
	
	public boolean search(String name) {
		return (super.getTen().equals(name))? true: false;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
