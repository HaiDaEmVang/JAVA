package quanlysach;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public abstract class SACH {
	protected String masach;
	protected String nhaxuatban;
	protected Date ngaynhap;
	protected double dongia;
	protected int soluong;
	
	protected Scanner sc;

	public SACH(String masach, String nhaxuatban, Date ngaynhap, double dongia, int soluong) {
		sc = new Scanner(System.in);
		this.masach = masach;
		this.nhaxuatban = nhaxuatban;
		this.ngaynhap = ngaynhap;
		this.dongia = dongia;
		this.soluong = soluong;
	}

	public SACH() {
		sc = new Scanner(System.in);
	}
	
	public abstract double tiengiam();

	
	public void nhap() {
		System.out.println("Nhap ma sach: ");
		this.masach = sc.nextLine();
		System.out.println("Nhap nha xuat ban: ");
		this.nhaxuatban = sc.nextLine();
		System.out.println("nhap vao ngay sinh");
		String nc = sc.nextLine();
		this.setNgaynhap(nc);
		System.out.println("Nhap vao don gia");
		this.dongia = sc.nextDouble();
		System.out.println("Nhap vao so luong: ");
		this.soluong = sc.nextInt();
		sc.nextLine();
	}
	
	public String xuat() {
		Calendar p = Calendar.getInstance();
		p.setTime(this.ngaynhap);
		return "SACH [masach: " + masach + ", nhaxuatban: " + nhaxuatban + ", ngaynhap: " + (p.get(Calendar.DATE)+"/"+(p.get(Calendar.MONTH)+1)+"/" +p.get(Calendar.YEAR)) + ", dongia: " + dongia
				+ ", soluong: " + soluong + "]"; 
	}
	
	
	public String getMasach() {
		return masach;
	}

	public void setMasach(String masach) {
		this.masach = masach;
	}

	public String getNhaxuatban() {
		return nhaxuatban;
	}

	public void setNhaxuatban(String nhaxuatban) {
		this.nhaxuatban = nhaxuatban;
	}

	public Date getNgaynhap() {
		return ngaynhap;
	}

	public void setNgaynhap(String ns) {
		SimpleDateFormat p = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.ngaynhap = p.parse(ns);
		}catch (Exception e) {
			System.out.println("nhap dinh dang ngay nhap sai!!");
			this.setNgaynhap(sc.nextLine());
		}
		
	}

	public double getDongia() {
		return dongia;
	}

	public void setDongia(double dongia) {
		this.dongia = dongia;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
}
