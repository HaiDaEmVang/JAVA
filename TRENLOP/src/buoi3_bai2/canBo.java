package buoi3_bai2;

import java.util.Scanner;

public class canBo {
	private String ten;
	private int gt;
	private String diaChi;
	private String sdt;
	protected Scanner sc = new Scanner(System.in);
	
	
	public canBo() {
	}


	public canBo(String ten, int gt, String diaChi, String sdt) {
		super();
		this.ten = ten;
		this.gt = gt;
		this.diaChi = diaChi;
		this.sdt = sdt;
	}
	
	public void nhap() {
		System.out.println("Nhap vao ten: ");
		this.ten = sc.nextLine();
		do {
			System.out.println("Nhap vao gioi tinh(1,0): " );
			this.gt = sc.nextInt();
		}while(!(this.gt == 0 || this.gt == 1));
		sc.nextLine();
		System.out.println("Nhap vao dia chi: ");
		this.diaChi = sc.nextLine();
		do {
			System.out.println("Nhap vao sdt: ");
			this.sdt = sc.nextLine();
		}while(this.sdt.charAt(0)!='0' || this.sdt.length() != 10);
	}
	
	@Override
	public String toString() {
		return "CanBo: " + this.ten + "\nGioi tinh: " + ((this.gt == 1)? "Nam": "Nu") + "\nDia Chi: " + this.diaChi + "\nSdt: " + this.sdt;
	}


	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getGt() {
		return gt;
	}
	public void setGt(int gt) {
		this.gt = gt;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	
	
}
