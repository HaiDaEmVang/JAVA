package buoi3_bai4;

import java.util.Scanner;

import buoi3_bai3.sach;

public class main {
//	tinh tong dien tich
	public static double tongDienTich(shape[] list) {
		double sum = 0;
		for(int i = 0; i< list.length; i++) {
			if(list[i] instanceof circle) {
				circle ht = (circle) list[i];
				sum += ht.dientich();
			}else {
				rectangle ht = (rectangle) list[i];
				sum += ht.dientich();
			}	
		}
		return Math.round(sum * 100)/100.0;
	}
//	ham nhap danh sach
	public static shape[] nhap(int n, shape[] list) {
		
		list = new shape[n];
		for(int i = 0; i< n ;i++) {
			shape hinh;
			System.out.println("Nhap danh hinh thu " + (i + 1));
			System.out.println("lua chon hinh nhap(1. tron || 2.chu nhat): ");
			int k = sc.nextInt();
			hinh = (k == 1)? new circle(): new rectangle();
			hinh.nhap();
			list[i] = hinh;
		}
		return list;
	}
//	ham in danh sach
	public static void xuat(int n, shape[] list) {
		
		System.out.println("Danh sach hinh: ");
		if(n == 0) {
			System.out.println("Danh sach rong");
			return;
		}
		for(int i = 0; i<n;i++) {
			if(list[i] instanceof circle) {
				circle ht = (circle)list[i];
				System.out.println(ht.toString() + "\n");
			}else {
				rectangle ht = (rectangle)list[i];
				System.out.println(ht.toString() + "\n");
			}
		}
	}
//	menu
	public static void menu(int n, shape[] list) {
		while(true) {
			System.out.println("============ Menu ============");
			System.out.println("1. Nhap vao n hinh");
			System.out.println("2. In danh sach sach");
			System.out.println("3. In ra tong dien tich cua cacs hinh trong mang lisst");
			System.out.println("4. Thoat");
			System.out.println("==============================");
			
			
			int luachon;
			luachon = sc.nextInt();
			switch(luachon) {
				case 1: 
					System.out.println("Nhap vao so luong hinh: ");
					n = sc.nextInt();
					list = nhap(n, list);
					System.out.println("Nhap danh sach sach thanh cong!!");
					break;
				case 2:
					xuat(n, list);
					System.out.println("In danh sach thanh cong");
					break;
				case 3:
					System.out.println("Tong dien tich: " + tongDienTich(list));
					break;
				case 4:
					return;
			}
		}
	}
	
	public static Scanner sc = new Scanner(System.in);
//	main
	public static void main(String[] args) {
		int n = 0; 
		shape[] list = null;
		menu(n, list);
	}
}
