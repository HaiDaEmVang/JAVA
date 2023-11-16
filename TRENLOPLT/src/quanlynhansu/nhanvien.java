package quanlynhansu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import BAITAPKETHUA.main;

public abstract  class nhanvien {
	protected String hoten;
	protected Date ngaysinh;
	protected int gioitinh;
	protected Date ngayvaocq;
	protected String cmnd;
	protected final double luongcoban=18.0000;
	
	protected Scanner sc;

	public nhanvien(String hoten, Date ngaysinh, int gioitinh, Date ngayvaocq, String cmnd) {
		this.hoten = hoten;
		this.ngaysinh = ngaysinh;
		this.gioitinh = gioitinh;
		this.ngayvaocq = ngayvaocq;
		this.cmnd = cmnd;
		sc = new Scanner(System.in);
	}

	public nhanvien() {
		sc = new Scanner(System.in);
	}
	
	public void nhap() throws ParseException {
		System.out.println("Nhap vao ho ten nhan vien: ");
		this.hoten = sc.nextLine();
		System.out.println("Nhap vao ngay sinh nhan vien: ");
		SimpleDateFormat p = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.ngaysinh = p.parse(sc.nextLine());
		}catch (Exception e) {
			System.out.println("nhap ngay sinh sai dinh dang!!");
			this.ngaysinh = p.parse("01/01/2004");
		}
		System.out.println("Nhap vao gioi tinh(1||0) nhan vien: ");
		this.gioitinh = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao co quan nhan vien: ");
		this.ngayvaocq = p.parse(sc.nextLine());
		System.out.println("Nhap vao cmnd nhan vien: ");
		this.cmnd = sc.nextLine();
	}
	public String xuat() {
		return "ho ten: " + this.hoten +" ngaysinh: " + (this.ngaysinh.getDate()) +"/"+ (this.ngaysinh.getMonth()+1) +"/"+(this.ngaysinh.getYear()+1900) + " gioitinh: " + ((this.gioitinh == 1)? "Nam": "Nu" ) + 
				" Ngay vao co quan: " + (this.ngayvaocq.getDate()) +"/"+ (this.ngayvaocq.getMonth()+1) +"/"+(this.ngayvaocq.getYear()+1900) + " cmnd: " + this.cmnd;
	}
	
	public abstract double luong();
	public abstract double phucap();
	
	public double thamnien() {
		Calendar cal_ht = Calendar.getInstance();
		Calendar cal_ngayvao = Calendar.getInstance();
		cal_ngayvao.setTime(this.ngaysinh);
		return cal_ht.get(Calendar.YEAR) - cal_ngayvao.get(Calendar.YEAR);
	}
	
}
