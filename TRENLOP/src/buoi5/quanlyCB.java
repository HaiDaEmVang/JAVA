package buoi5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import buoi3_bai2.canBo;
import buoi3_bai2.nhanVien;

public class quanlyCB {
	public static ArrayList<Canbo> list;
	public static Scanner sc = new Scanner(System.in);
	
	public static void insertCB(){
		System.out.println("Nhap vao so luong can bo: ");
		Canbo p = null;
		int n, luachon;
		n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i< n; i++) {
			System.out.println("1. nhap thong tin cho cong nhan ");
			System.out.println("2. nhap thong tin cho Ky su ");
			System.out.println("3. nhap thong tin cho Nhan vien \n");
			
			System.out.println("Nhap vao lua chon: ");
			luachon = sc.nextInt();
			sc.nextLine();
			
			switch(luachon) {
				case 1: {
					p = new Congnhan();
					break;
				}
				case 2: {
					p = new kysu();
					break;
				}
				case 3: {
					p = new Nhanvien();
					break;
				}
			}
			p.nhap();
			list.add(p);
		}
	}
	public static void in(List<Canbo> list) {
		if(list.isEmpty()) {
			System.out.println("Khong tim thay ket qua nao!!\n");
		}else {
			String tmp = String.format("|| %5s || %20s || %5s || %10s || %20s || %15s || %20s\\n", "Stt", "Ten can bo","Tuoi", "Gioi tinh", "Dia chi", "Loai can bo", "dac diem rieng");
			System.out.println(tmp);
			for(int i = 0; i< list.size(); i++) {
				String t = String.format("|| %5d ", i+1) + list.get(i).toString();
				System.out.println(t);
			}
		}
	}
	public static ArrayList<Canbo> search(ArrayList<Canbo> listsearch, String name){
		
		name = name.trim().toLowerCase();
		for(int i = 0;i< list.size(); i++)
			if(list.get(i).name.toLowerCase().contains(name))
				listsearch.add(list.get(i));
		
		return listsearch;
	}
	public static void menu() {
		list = new ArrayList<>();
		int luachon;
		boolean flag = false;
		while(1>0) {
			
			System.out.println("1. Nhap thong tin can bo");
			System.out.println("2. In thong tin can bo");
			System.out.println("3. Tim thong tin can bo");
			System.out.println("4. Thoat.\n");
			
			System.out.println("Nhap vao lua chon: ");
			luachon = sc.nextInt();
			sc.nextLine();
			
			switch(luachon) {
				case 1:{
					insertCB();
					System.out.println("Nhap thanh cong!!!\n\n");
					break;
				}
				case 2:{
					in(list);
					System.out.println("In thanh cong!!!\n\n");
					break;
				}
				case 3: {
					String name;
					System.out.println("Nhap vao ten can tim: ");
					name = sc.nextLine();
					ArrayList<Canbo> listsearch = new ArrayList<Canbo>();
					listsearch = search(listsearch, name);
					in(listsearch);
					System.out.println("\n");
					break;
				}
				case 4: {
					flag = true; 
				}
				if(flag)
					break;
			}
		}
	}
	public static void main(String[] args) {
		menu();
	}
}
