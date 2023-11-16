package giuakyLT;

import java.util.Date;

public class khachhangvietnam extends khachhang{
	private String doituongkhachhang;
	private double dinhmuc;
	
	
	public khachhangvietnam(String makhachhang, String hoten, Date ngayrahoadon, double soluong, double dongia,
			String doituongkhachhang, double dinhmuc) {
		super(makhachhang, hoten, ngayrahoadon, soluong, dongia);
		this.doituongkhachhang = doituongkhachhang;
		this.dinhmuc = dinhmuc;
	}
	
	public khachhangvietnam(String makhachhang, String hoten, Date ngayrahoadon, double soluong, double dongia) {
		super(makhachhang, hoten, ngayrahoadon, soluong, dongia);
	}
	public khachhangvietnam() {
		super();
	}
	
	public void nhap() {
		super.nhap();
		System.out.println("Nhap vao doi tuong khach hang: ");
		this.doituongkhachhang = sc.nextLine();
		System.out.println("Nhap vao dinh muc: ");
		this.dinhmuc = sc.nextDouble();
		sc.nextLine();
	}
	public String xuat() {
		return super.xuat()+ " doi tuong: " + this.doituongkhachhang +
							" dinh muc: " + this.dinhmuc;
	}
	@Override
	public double tinhthanhtien() {
		if(this.soluong<= this.dinhmuc)
			return this.soluong * this.dongia;
		else 
			return this.soluong * this.dongia * this.dinhmuc + ((this.soluong- this.dinhmuc)* dongia * 2.5);

	}

}
