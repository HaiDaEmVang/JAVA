package buoi3_bai4;

import java.util.Scanner;

public class shape {
	protected String color;
	protected boolean filled;
	protected Scanner sc = new Scanner(System.in);
	
	public shape() {
	}
	public shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	@Override
	public String toString() {
		return "|| Colo: " + this.color + "|| Trang thai:  " + ((this.filled)?" co to mau": "khong to mau");
	}
	public double dienTich() {
		return 0;
	}	
	public void nhap() {
		System.out.println("Nhap vao color: ");
		this.color = sc.nextLine();
		System.out.println("Nhap vao trang thai: ");
		this.filled = (sc.nextLine().matches("(true)|1|(dung)|(co)|(yes)")? true: false);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	
}
