package buoi5;

import java.util.Scanner;

public class Canbo {
	protected String name;
	protected int tuoi;
	protected int gt;
	protected String diachi;
	protected Scanner sc = new Scanner(System.in);
	
	public Canbo() {
	}


	public Canbo(String name, int tuoi, int gt, String diachi) {
		this.name = name;
		this.tuoi = tuoi;
		this.gt = gt;
		this.diachi = diachi;
	}
	
	public void nhap() {
		System.out.println("Nhap vao ten: ");
		this.name = sc.nextLine().trim();
		System.out.println("Nhap vao tuoi: ");
		this.tuoi = sc.nextInt();
		do {
			System.out.println("Nhap vao gioi tinh: ");
			this.gt = sc.nextInt();
		}while(this.gt >=2 || this.gt<0);
		sc.nextLine();
		System.out.println("Nhap vao dia chi: ");
		this.diachi = sc.nextLine();
	}
	public String toString() {
		return String.format("|| %20s || %5d || %10s || %20s ", this.name, this.tuoi, this.gt == 1? "Nam": "Nu", this.diachi) ; 
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public int getGt() {
		return gt;
	}
	public void setGt(int gt) {
		this.gt = gt;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
}
