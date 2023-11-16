package buoi3_bai3;

import java.util.Scanner;

public class taiLieu {
	private String maTL;
	private String tenTL;
	private String tenNSX;
	private int soPH;
	protected Scanner sc = new Scanner(System.in);
	
	public taiLieu() {
	}
	public taiLieu(String maTL, String tenTL, String tenNSX, int soPH) {
		this.maTL = maTL;
		this.tenTL = tenTL;
		this.tenNSX = tenNSX;
		this.soPH = soPH;
	}
	public void nhap() {
		System.out.println("Nhap vao ma tai lieu: ");
		this.maTL = sc.nextLine();   
		System.out.println("Nhap vao ten tai lieu: ");
		this.tenTL = sc.nextLine();
		System.out.println("Nhap vao ten nha san xuat: ");
		this.tenNSX = sc.nextLine();
		System.out.println("Nhap vao so phat hanh: ");
		this.soPH = sc.nextInt();
	}
	@Override
	public String toString() {
		return "Ma tai lieu:" + this.maTL + " Ten tai lieu: " + this.tenTL + " Ten nha san xuat: " + this.tenNSX +" So phat hanh: " + this.soPH;
	}
	
	public String getMaTL() {
		return maTL;
	}
	public void setMaTL(String maTL) {
		this.maTL = maTL;
	}
	public String getTenTL() {
		return tenTL;
	}
	public void setTenTL(String tenTL) {
		this.tenTL = tenTL;
	}
	public String getTenNSX() {
		return tenNSX;
	}
	public void setTenNSX(String tenNSX) {
		this.tenNSX = tenNSX;
	}
	public int getSoPH() {
		return soPH;
	}
	public void setSoPH(int soPH) {
		this.soPH = soPH;
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	
	
//	matailieu, tentailieu, tennhasanxuat, sophathanh. Với đầy đủ các hàm get, set và constructor
}
