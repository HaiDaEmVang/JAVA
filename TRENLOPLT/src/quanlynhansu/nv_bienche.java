package quanlynhansu;

import java.text.ParseException;
import java.util.Date;

public class nv_bienche extends nhanvien{
	private double hesoluong;
	

	public nv_bienche(String hoten, Date ngaysinh, int gioitinh, Date ngayvaocq, String cmnd, double hesoluong) {
		super(hoten, ngaysinh, gioitinh, ngayvaocq, cmnd);
		this.hesoluong = hesoluong;
	}
	
	public nv_bienche() {
		super();
	}

	public void nhap() throws ParseException {
		super.nhap();
		System.out.println("Nhap vao he so lluong: ");
		this.hesoluong = sc.nextDouble();
		sc.nextLine();
	}
	
	public String xuat() {
		return super.xuat() +  " phu cap : " + this.phucap() + " luong: " + this.luong();
	}
	@Override
	public double luong() {
		return this.hesoluong * this.luongcoban + this.phucap();
	}

	@Override
	public double phucap() {
		return 0.1*(this.luongcoban + ((this.thamnien() >= 10)? 500000: 200000));
	}
	
}
