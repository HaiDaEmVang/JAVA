package quanlynhansu;

import java.text.ParseException;
import java.util.Date;

public class nv_hopdong extends nhanvien{
	private double mucluong;
	
	
	
	public nv_hopdong(String hoten, Date ngaysinh, int gioitinh, Date ngayvaocq, String cmnd, double mucluong) {
		super(hoten, ngaysinh, gioitinh, ngayvaocq, cmnd);
		this.mucluong = mucluong;
	}
	public nv_hopdong() {
		
	}
	public void nhap() throws ParseException {
		super.nhap();
		System.out.println("Nhapv vao muc luong: ");
		this.mucluong = sc.nextDouble();
		sc.nextLine();
	}
	
	public String xuat() {
		return super.xuat()  + " phu cap: " + this.phucap() + " luong: " + this.luong();
	}
	@Override
	public double luong() {
		// TODO Auto-generated method stub
		return this.luongcoban + this.mucluong + this.phucap();
	}

	@Override
	public double phucap() {
		// TODO Auto-generated method stub
		 return 0.1*(this.mucluong + ((this.thamnien() >= 2)? 200000: 100000));
	}

}
