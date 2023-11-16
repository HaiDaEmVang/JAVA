package buoi3_bai2;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0; 
		nhanVien[] dsnv = null;
		
		while(true) {
			System.out.println("============ Menu ============");
			System.out.println("1. Nhap vao n nhan vien");
			System.out.println("2. In danh sach nhan vien");
			System.out.println("3. Tim kiem theo ho ten");
			System.out.println("4. Thoat");
			System.out.println("==============================");
			
			boolean flag = false;
			
			int luachon;
			luachon = sc.nextInt();
			switch(luachon) {
				case 1: {
					System.out.println("Nhap vao so luong nhan vien: ");
					n = sc.nextInt();
					dsnv = new nhanVien[n];
					for(int i = 0; i< n ;i++) {
						nhanVien nv = new nhanVien();
						System.out.println("Nhap danh sach nhan vien thu " + (i +1));
						nv.nhap(); 
						dsnv[i] = nv;
					}
					System.out.println("Nhap danh sach nhan vien thanh cong!!");
					break;
				}
				case 2:{
					System.out.println("Danh sach nhan vien: ");
					if(n == 0) {
						System.out.println("Danh sach rong");
						break;
					}
					for(int i = 0; i<n;i++) {
						System.out.println(dsnv[i].toString() + "\n");
					}
					System.out.println("In danh sach thanh cong");
					break;
				}
				case 3: {
					sc.nextLine();
					System.out.println("Nhap vao ten nhan vien can tim: ");
					String name = sc.nextLine();
					System.out.println("Danh sach nhan vien tim duoc: ");
					int cnt = 0;
					for(int i = 0; i< n; i++) {
						if(dsnv[i].search(name)) {
							cnt++;
							System.out.println(dsnv[i].toString() + "\n");
						}	
					}
					if(cnt == 0)
						System.out.println("Khong tim thay nhan vien: " + name + " trong danh sach");
					else
						System.out.println("Tim thay: " + cnt + " nhan vien co ten: " + name);	
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
