package giuakyLT;

import java.util.Date;

public class khachhangnuocngoai extends khachhang{
	private String quoctich;
	
	
	public khachhangnuocngoai(String makhachhang, String hoten, Date ngayrahoadon, double soluong, double dongia,
			String quoctich) {
		super(makhachhang, hoten, ngayrahoadon, soluong, dongia);
		this.quoctich = quoctich;
	}

	public khachhangnuocngoai() {
		super();
	}
	
	public void nhap() {
		super.nhap();
		System.out.println("Nhap vao quoc tich: ");
		this.quoctich = sc.nextLine();
	}
	public String xuat() {
		return super.xuat()+ " quoc tich: " + this.quoctich;
	}
	@Override
	public double tinhthanhtien() {
		return this.soluong * this.dongia;
		// TODO Auto-generated method stub
		
	}


}
