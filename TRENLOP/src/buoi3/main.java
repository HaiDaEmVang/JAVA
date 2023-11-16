package buoi3;

import java.util.Scanner;

import buoi3_bai2.nhanVien;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0; 
		Student[] dssv = null;
		
		while(true) {
			System.out.println("============ Menu ============");
			System.out.println("1. Nhap vao n sinh vien");
			System.out.println("2. In danh sach sinh vien");
			System.out.println("3. kiem tra hoc sinh co kha nang nhan hoc bong");
			System.out.println("4. Thoat");
			System.out.println("==============================");
			
			boolean flag = false;
			
			int luachon;
			luachon = sc.nextInt();
			switch(luachon) {
				case 1: {
					System.out.println("Nhap vao so luong sinh vien: ");
					n = sc.nextInt();
					dssv = new Student[n];
					for(int i = 0; i< n ;i++) {
						Student sv = new Student();
						System.out.println("Nhap danh sach sinh vien thu " + (i +1));
						sv.nhap(); 
						dssv[i] = sv;
					}
					System.out.println("Nhap danh sach sinh vien thanh cong!!");
					break;
				}
				case 2:{
					System.out.println("Danh sach sinh vien: ");
					if(n == 0) {
						System.out.println("Danh sach rong");
						break;
					}
					for(int i = 0; i<n;i++) {
						System.out.println(dssv[i].toString() + "\n");
					}
					System.out.println("In danh sach thanh cong");
					break;
				}
				case 3: {
					
					int cnt = 0;
					for(int i = 0; i< n; i++) {
						if(dssv[i].checkHocBong()) {
							cnt++;
							System.out.println(dssv[i].toString() + "\n");
						}	
					}
					if(cnt == 0)
						System.out.println("Khong co hoc sinh du dieu kien");
					else
						System.out.println("Tim thay: " + cnt + " co kha nang nhan hoc bong");	
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
