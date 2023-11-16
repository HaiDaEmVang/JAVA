package buoi3_bai4;

import java.util.Scanner;

public class main1 {
	public static double tongDienTich(int n, shape[] list) {
		double sum = 0;
		for(int i = 0;i< n; i++) {
			if(list[i] instanceof circle) {
				circle ht = (circle) list[i];
				sum+= ht.dientich();
			}else {
				rectangle ht = (rectangle) list[i];
				sum+= ht.dientich();
			}
		}
		return Math.round(sum * 100)/ 100.0;
	}
	public static shape[] nhap(int n, shape[] list) {
		
		list = new shape[n];
		for(int i =0; i< n; i++) {
			System.out.println("Nhap vao lua chon 1|tron 2| chunhat ");
			int luachon;
			luachon = sc.nextInt();
			switch(luachon) {
				case 1:{
					shape ht = new circle();
					ht.nhap();
					list[i] = ht;
					break;
				}
				case 2: {
					shape ht = new rectangle();
					ht.nhap();
					list[i] = ht;
					break;
				}
			}
		}
		return list;
	}
	
	public static void xuat(int n, shape[] list) {
		for(int i = 0;i< n; i++) {
			System.out.println(list[i].toString());
		}
	}
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
					System.out.println("Tong dien tich: " + tongDienTich(n, list));
					break;
				case 4:
					return;
			}
		}
	}
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = 0;
		shape[] list = null;
		menu(n, list);
	}

}
