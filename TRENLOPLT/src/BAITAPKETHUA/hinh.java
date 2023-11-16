package BAITAPKETHUA;

import java.util.Scanner;

public class hinh {
	private String name;
	private String mau;
	private boolean tomau;
	
	protected Scanner sc;
	
	public hinh() {
		sc = new Scanner(System.in);
	}
	public hinh(String name, String mau, boolean tomau) {
		this.name = name;
		this.mau = mau;
		this.tomau = tomau;
		sc = new Scanner(System.in);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMau() {
		return mau;
	}
	public void setMau(String mau) {
		this.mau = mau;
	}
	public boolean isTomau() {
		return tomau;
	}
	public void setTomau(boolean tomau) {
		this.tomau = tomau;
	}
	public void nhap() {
		System.out.println("Nhap vao ten hinh: ");
		this.name = sc.nextLine();
		System.out.println("Nhap vao mau: ");
		this.mau = sc.nextLine();
		System.out.println("Nhap vao to mau: ");
		this.tomau = sc.nextBoolean();
	}
	
	@Override
	public String toString() {
		return "hinh: "+ this.name + " co mau: " + this.mau + " trang thai to mau: "+ this.tomau;
	}

	
}
