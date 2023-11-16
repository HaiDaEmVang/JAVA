package buoi6;

import java.util.Scanner;

public abstract class shape {
	protected String color;
	protected boolean fillter;
	protected Scanner sc;
	public shape(String color, boolean fillter) {
		this.color = color;
		this.fillter = fillter;
		sc = new Scanner(System.in);
	}
	public shape() {
		sc = new Scanner(System.in);
		this.color = "";
		this.fillter = false;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFillter() {
		return fillter;
	}
	public void setFillter(boolean fillter) {
		this.fillter = fillter;
	}
	
	public void nhap() {
		System.out.println("Nhap vao mau hinh: ");
		this.color = sc.nextLine();
		try {
			System.out.println("Nhap vao trang thai: ");
			this.fillter = sc.nextBoolean();
		}catch (Exception e) {
			System.out.println("Loi nhap vao trang thai ");
			sc.nextLine();
		}
	}
	
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	public String toString() {
		return String.format(" %10s || %20s ||", this.color, (this.fillter)? "Co to": "Khong duoc to");
	}
	
}
