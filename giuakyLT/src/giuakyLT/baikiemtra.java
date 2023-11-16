package giuakyLT;

import java.util.Scanner;

public class baikiemtra {
	public static dskhachhang ds = new dskhachhang();
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void menuKhachhang(){
		boolean flag = false;
		while(true) {
			System.out.println("\n------menu---------");
			System.out.println("1. Them khach hang; ");
			System.out.println("2. xoa khach hang.");
			System.out.println("3. cap nhat khach hang.");
			System.out.println("4. hien thi danh sach khach hang..");
			System.out.println("5. Tim kiem khach hang..");
			System.out.println("6. Tinh tong tien theo loai khach hang..");
			System.out.println("7. Thoat.");
			System.out.println("-------------------\n");
			int luachon;
			System.out.println("Nhap vao lua chon: ");
			luachon = sc.nextInt();
			sc.nextLine();
			switch(luachon) {
				case 1:{
					ds.addcustomer();
					System.out.println("goi tac vu thanh cong!!");
					break;
				}
				case 2:{
					ds.delcustomer();
					System.out.println("goi tac vu thanh cong!!");
					ds.print();
					break;
				}
				case 3:{
					ds.updatecustomer();
					System.out.println("goi tac vu thanh cong!!");
					ds.print();
					break;
				}
				case 4:{
					ds.print();
					System.out.println("goi tac vu thanh cong!!");
					break;
				}
				case 5:{
					System.out.println(ds.search());
					System.out.println("goi tac vu thanh cong!!");
					break;
				}
				case 6:{
					System.out.println("tong so luong cua khach hang nuoc ngoai: " + ds.totaluk());
					System.out.println("tong so luong cua khach hang viet nam: " + ds.totalvn());
					System.out.println("goi tac vu thanh cong!!");
					break;
				}
				case 7:{
					flag = true;
				}
			}
			if(flag)
				break;
		}
		
	}
	public static void main(String[] args) {
		menuKhachhang();
	}
}
