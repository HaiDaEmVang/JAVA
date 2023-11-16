package quanlysach;

import java.text.ParseException;
import java.util.Scanner;

public class BAIKIEMTRA {
	public static void main(String[] args) throws ParseException {
		DSSACH ds = new DSSACH();
		
		Scanner sc = new Scanner(System.in);
		
		int luachon;
		while(1>0) {
			System.out.println("\n======================");
			System.out.println("nhap lua chon: ");
			System.out.println("1. quan ly danh sach");
			System.out.println("2. thoat.");
			System.out.println("=======================\n");
			
			luachon = sc.nextInt();
			sc.nextLine();
			if(luachon == 1) {
				ds.menuSach();
			}else {
				break;
			}
		}
	}
}
