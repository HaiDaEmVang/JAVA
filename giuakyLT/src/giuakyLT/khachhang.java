package giuakyLT;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class khachhang implements itiendien {
	protected String makhachhang;
	protected String hoten;
	protected Date ngayrahoadon;
	protected double soluong;
	protected double dongia;
	
	protected Scanner sc;

	public khachhang(String makhachhang, String hoten, Date ngayrahoadon, double soluong, double dongia) {
		sc = new Scanner(System.in);
		this.makhachhang = makhachhang;
		this.hoten = hoten;
		this.ngayrahoadon = ngayrahoadon;
		this.soluong = soluong;
		this.dongia = dongia;
	}

	public khachhang() {
		sc = new Scanner(System.in);
	}
	
	public void nhap() {
		System.out.println("Nhap vao ma khach hang: ");
		this.makhachhang = sc.nextLine();
		System.out.println("Nhap vao ho ten khach hang: ");
		this.hoten = sc.nextLine();
		System.out.println("Nhap vao ngay ra hoa don: ");
		this.setNgayrahoadon(sc.nextLine());
		System.out.println("Nhap vao so luong: ");
		this.soluong = sc.nextDouble();
		System.out.println("Nhap vao dong gia: ");
		this.dongia = sc.nextDouble();
		sc.nextLine();
	}
	
	public String xuat() {
		SimpleDateFormat p = new SimpleDateFormat("dd/MM/yyyy");
		return "ma khach hang: "+ this.makhachhang +
				" ten khach hang: "+ this.hoten+
				" ngay ra hoa don: "+ (p.format(this.ngayrahoadon))+
				" so luong: " + this.soluong+
				" don gia: " + this.dongia;
	}

	public String getMakhachhang() {
		return makhachhang;
	}

	public void setMakhachhang(String makhachhang) {
		this.makhachhang = makhachhang;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public Date getNgayrahoadon() {
		return ngayrahoadon;
	}

	public void setNgayrahoadon(String ns) {
		SimpleDateFormat p = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.ngayrahoadon =  p.parse(ns);
		}catch (Exception e) {
			System.out.println("Loi dinh dang ngay nhap! nhap lai!!!");
			setNgayrahoadon(sc.nextLine());
		}
	}

	public double getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public double getDongia() {
		return dongia;
	}

	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	
	
	
}
