package buoi3;

import java.util.Scanner;

public class Person {
	private String ten;
	private int gioiTinh;
	private String diaChi;
	private time ngaySinh;
	
	protected Scanner sc = new Scanner(System.in);
	public Person() {
		
	}
	public Person(String ten, int gt, String diachi, time ngaysinh) {
		this.ten = ten;
		this.gioiTinh = gt;
		this.diaChi = diachi;
		this.ngaySinh = ngaysinh;
	}
	
	public void nhap() {
		System.out.println("Nhap vao ten: ");
		this.ten = sc.nextLine();
		System.out.println("Nhap vao gioi tinh(1,0): ");
		this.gioiTinh = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao dia chi: ");
		this.diaChi = sc.nextLine();
		this.ngaySinh = new time();
		this.ngaySinh.nhap();
	}
	
	@Override
	public String toString() {
		return "Ten: " + this.ten+ "\nGioi tinh: " + ((this.gioiTinh == 1)? "Nam" : "Nu") + "\nDia chi: " + this.diaChi + "\nNgay sinh: " + this.ngaySinh.toString();  
				
	}
	
	public String getTen() {
		return this.ten;
	}
	public String getDiaChi() {
		return this.diaChi;
	}
	public int getGioiTinh() {
		return this.gioiTinh;
	}
	public String getNgaySinh() {
		return this.ngaySinh.toString();
	}
	public void setTen(String name) {
		this.ten = name;
	}
	public void setGioiTinh(int gt) {
		this.gioiTinh = gt;
	}
	public void setDiaChi(String diachi) {
		this.diaChi = diachi;
	}
	public void setNgaySinh(time ngaysinh) {
		this.ngaySinh = ngaysinh;
	}
	
	
}
