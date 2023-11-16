package buoi6;

import java.util.ArrayList;
import java.util.Scanner;

public class lengochai_buoi6 {
	public static ArrayList<shape> list = new ArrayList<>();
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void nhap() {
		int n;
		System.out.println("Nhap vao so luong hinh: ");
		n = sc.nextInt();
		sc.nextLine();
		
		shape hinh = null;
		for(int i = 0;i< n; i++) {
			System.out.println("Nhap vao 1: vuong || 2: tron || 3: chu nhat");
			int k;
			k = sc.nextInt();
			sc.nextLine();
			if(k == 1) 
				hinh = new square();
			else
				if(k == 2)
					hinh = new circle();
				else
					hinh = new regtangle();
			list.add(hinh);
			hinh.nhap();
		}
	}
	public static void in() {
		String name = "";
		System.out.printf("|| %15s || %13s || %10s || %10s || %10s || %20s ||\n", "Ten", "kich thuoc", "dien tich", "chu vi", "mau", "trang thai");
		for( shape x: list) {
			if(x instanceof circle) {
				x = (circle)x;
				name = String.format("|| %15s ||", "circle");
			}
			else
				if(x instanceof square) {
					x = (square)x;
					name = String.format("|| %15s ||", "square");
				}
				else {
					x = (regtangle)x;
					name = String.format("|| %15s ||", "regtangle");
				}
					
			System.out.println(name + x.toString());
		}
	}
	
	public static void main(String[] args) {
		nhap();
		in();
	}
}
