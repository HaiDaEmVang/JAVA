package BAI1;

import java.util.Scanner;

public class HINHTON {
	private double r;

	public HINHTON() {
		
	}
	public HINHTON(double r) {
		this.r = r;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ban kinh hinh tron: ");
		double a = sc.nextDouble();
		this.r = a;
	}
	public double chuvi() {
		return 2*Math.PI*r;
	}
	public double dientich() {
		return Math.PI*Math.pow(r, 2);
	}
	public void xuat() {
		System.out.println("chu vi hinh tron: " + this.chuvi());
		System.out.println("chu vi hinh tron: " + this.dientich());
	}
	
	public static void main(String[] args) {
		HINHTON h1 = new HINHTON();
		h1.nhap();
		h1.xuat();
	}
	
	
}
