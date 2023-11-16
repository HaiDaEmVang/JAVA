package quanlynhansu;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import BAITAPKETHUA.main;

public class ql_nhanvien {
	public static Scanner sc = new Scanner(System.in);

	public static ArrayList<nhanvien> list;
	
	public static double tongtra() {
		int sum = 0;
		for (nhanvien x : list) {
			sum += x.luong();
		}
		return sum;
	}

	public static void sortluong() {
		Collections.sort(list, new Comparator<nhanvien>() {
			public int compare(nhanvien o1, nhanvien o2) {
				return Double.compare(o1.luong(), o2.luong());
			}
		});
	}

	public static void main(String[] args) throws ParseException {
		list = new ArrayList<nhanvien>();
		boolean flag = false;
		while(1>0) {
			System.out.println("----------menu----------");
			System.out.println("1.Nhap thong tin nhan vien");
			System.out.println("2.xuat thong tin nhan vien");
			System.out.println("3.Tong tien phai tra:");
			System.out.println("4.sap xep theo luong");
			System.out.println("------------------------");
			
			System.out.println("nhap vao lua chon: ");
			int luachon;
			luachon = sc.nextInt();
			sc.nextLine();
			
			switch(luachon) {
				case 1: {
					int n;
					System.out.println("Nhap vao so luong nhan vien: ");
					n = sc.nextInt();
					sc.nextLine();
					nhanvien tmp;
					while(n-- > 0) {
						System.out.println("loai:\n 1. cong nhan bien che");
						System.out.println("2. cong nhan hop dong");
						luachon = sc.nextInt();
						sc.nextLine();
						if(luachon == 1) {
							tmp = new nv_bienche();
						}else
							tmp = new nv_hopdong();
						tmp.nhap();
						list.add(tmp);
					}
					break;
				}
				case 2: {
					for(nhanvien x: list)
						System.out.println(x.xuat());
					break;
				}
				case 3: {
					System.out.println("Tong tien phai tra la: "+ tongtra());
					break;
				}
				case 4: {
					sortluong();
					for(nhanvien x: list)
						System.out.println(x.xuat());
					break;
				}
				case 5:{
					flag = true;
				}
				if(flag)
					break;
			}
		}
	}

}
