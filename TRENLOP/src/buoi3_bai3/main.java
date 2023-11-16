package buoi3_bai3;

import java.util.Scanner;

import buoi3_bai2.nhanVien;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0; 
		sach[] dss = null;
		
		while(true) {
			System.out.println("============ Menu ============");
			System.out.println("1. Nhap vao n sach");
			System.out.println("2. In danh sach sach");
			System.out.println("3. Tim kiem theo so phat hanh");
			System.out.println("4. Thoat");
			System.out.println("==============================");
			
			boolean flag = false;
			
			int luachon;
			luachon = sc.nextInt();
			switch(luachon) {
				case 1: {
					System.out.println("Nhap vao so luong sach: ");
					n = sc.nextInt();
					dss = new sach[n];
					for(int i = 0; i< n ;i++) {
						sach nv = new sach();
						System.out.println("Nhap danh sach sach thu " + (i +1));
						nv.nhap(); 
						dss[i] = nv;
					}
					System.out.println("Nhap danh sach sach thanh cong!!");
					break;
				}
				case 2:{
					System.out.println("Danh sach sach: ");
					if(n == 0) {
						System.out.println("Danh sach rong");
						break;
					}
					for(int i = 0; i<n;i++) {
						System.out.println(dss[i].toString() + "\n");
					}
					System.out.println("In danh sach thanh cong");
					break;
				}
				case 3: {
					sc.nextLine();
					System.out.println("Nhap vao so phat hanh sach can tim: ");
					int soph = sc.nextInt();
					System.out.println("Danh sach sach tim duoc: ");
					int cnt = 0;
					for(int i = 0; i< n; i++) {
						if(dss[i].search(soph)) {
							cnt++;
							System.out.println(dss[i].toString() + "\n");
						}	
					}
					if(cnt == 0)
						System.out.println("Khong tim thay sach: " + soph + " trong danh sach");
					else
						System.out.println("Tim thay: " + cnt + " sach co so phat hanh: " + soph);	
					break;
				}
				case 4:{
					flag = true;
					break;
				}
			}
			if(flag)
				break;
		}
	}
}
