package quanlysach;


import java.util.Date;

public class SACHGIAOKHOA extends SACH implements ISACH {
	private String tinhtrang;

	
	public SACHGIAOKHOA(String masach, String nhaxuatban, Date ngaynhap, double dongia, int soluong, String tinhtrang) {
		super(masach, nhaxuatban, ngaynhap, dongia, soluong);
		this.tinhtrang = tinhtrang;
	}
	public SACHGIAOKHOA() {
		super();
		this.tinhtrang = "moi";
	}
	
	public void nhap() {
		super.nhap();
		System.out.println("Nhap vao tinh trang (1: cu||2: moi): ");
		int k = sc.nextInt();
		this.tinhtrang = ((k == 1)? "cu": "moi");
		sc.nextLine();
	}
	
	public String xuat() {
		return super.xuat() + "tinh trang sach: " + this.tinhtrang;
	}
	@Override
	public double TinhThanhTien() {
		// TODO Auto-generated method stub
		return this.soluong * this.dongia - this.tiengiam();
	}

	@Override
	public double tiengiam() {
		// TODO Auto-generated method stub
		return this.soluong * this.dongia * (this.tinhtrang.equals("moi")?0.1: 0.5);
	}
	public String getTinhtrang() {
		return tinhtrang;
	}
	public void setTinhtrang(String tinhtrang) {
		this.tinhtrang = tinhtrang;
	}
	
	
}
