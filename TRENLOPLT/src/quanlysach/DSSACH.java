package quanlysach;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.Scanner;

public class DSSACH {
	protected Hashtable<String,SACH> lists;
	protected Scanner sc = new Scanner(System.in);
	
	
	public DSSACH(Hashtable<String, SACH> lists) {
		this.lists = lists;
	}
	
	public DSSACH() {
		this.lists = new Hashtable<String, SACH>();
	}
	
	public void addbook(){
		SACH k;
		System.out.println("Nhap vao so luong sach can them: ");
		int n = sc.nextInt();
		for(int i = 0; i< n; i++) {
			System.out.println("Nhap vao loai sach (1. sachthamkhao|| 2.sachgiaokhoa): ");
			int n1 = sc.nextInt();
			if(n1 == 1) {
				k = new SACHTHAMKHAO();
			}else {
				k = new SACHGIAOKHOA();
			}
			k.nhap();
			lists.put(k.getMasach(), k);
		}
	}
	public void delbook() {
		String tmp;
		System.out.println("Nhap vao ma sach can xoa: ");
		tmp = sc.nextLine();
		if(lists.containsKey(tmp))
			lists.remove(tmp);
	}
	public void updatebook(){
		String masach;
		int n;
		boolean flag = false;
		System.out.println("Nhap vao ma sach can cap nhat: ");
		masach = sc.nextLine();
		if(lists.containsKey(masach)) {
			SACH k = lists.get(masach);
			System.out.println("nhap vao truong can thay doi gia " + "tri(1,masach 2,nhaxuatban 3, ngaynhap 4, dongia 5, soluong");
			n = sc.nextInt();
			sc.nextLine();
			
			switch(n) {
				case 1:{
					System.out.println("nhap ma sach moi: ");
					k.setMasach(sc.nextLine());
					lists.put(k.getMasach(), k);
					lists.remove(masach);
					break;
				}
				case 2:{
					System.out.println("nhap nha xuat ban moi: ");
					k.setNhaxuatban(sc.nextLine());
					break;
				}
				case 3:{
					System.out.println("nhap ngay nhap ban moi: ");
					k.setNgaynhap(sc.nextLine());
					break;
				}
				case 4:{
					System.out.println("nhap don gia ban moi: ");
					k.setDongia(sc.nextDouble());
					sc.nextLine();
					break;
				}
				case 5:{
					System.out.println("nhap so luong ban moi: ");
					k.setSoluong(sc.nextInt());
					sc.nextLine();
					break;
				}
			}
		}else {
			System.out.println("ko ton ma sach duoc nhap trong danh sach");
		}
	}
	public void print() {
		System.out.println("\n");
		if(lists.size() == 0) {
			System.out.println("danh sach rong");
			return;
		}
		lists.forEach((key, value) ->{
			System.out.println(value.xuat());
		});
		System.out.println("\n");
	}
	
	public String search() {
		String masach;
		System.out.println("Nhap vao ma sach can tim: ");
		masach = sc.nextLine();
		if(lists.containsKey(masach))
			return lists.get(masach).xuat();
		return "khon tim thay ma sach can tim";
	}
	
	
	public double totalstk() {
		double sumstk = 0;
		for(String k: lists.keySet()) {
			if(lists.get(k) instanceof SACHTHAMKHAO) {
				sumstk+= ((SACHTHAMKHAO) lists.get(k)).TinhThanhTien();
			}
		}
		return sumstk;
	}
	public double totalsgk() {
		double sumsgk = 0;
		for(String k: lists.keySet()) {
			if(lists.get(k) instanceof SACHGIAOKHOA) {
				sumsgk+= ((SACHGIAOKHOA) lists.get(k)).TinhThanhTien();
			}
		}
		return sumsgk;
	}
	
	public void menuSach(){
		System.out.println("\n------menu---------");
		System.out.println("1. Them sach; ");
		System.out.println("2. xoa sach.");
		System.out.println("3. cap nhat sach.");
		System.out.println("4. hien thi danh sach.");
		System.out.println("5. Tim kiem sach.");
		System.out.println("6. Tinh tong tien theo loai.");
		System.out.println("-------------------\n");
		int luachon;
		System.out.println("Nhap vao lua chon: ");
		luachon = sc.nextInt();
		sc.nextLine();
		switch(luachon) {
			case 1:{
				addbook();
				System.out.println("them sach thanh cong!!");
				break;
			}
			case 2:{
				this.delbook();
				System.out.println("xoa thanh cong sach!!");
				this.print();
				break;
			}
			case 3:{
				updatebook();
				System.out.println("goi udate thanh cong");
				this.print();
				break;
			}
			case 4:{
				print();
				System.out.println("in thanh cong!!");
				break;
			}
			case 5:{
				System.out.println(search());
				System.out.println("Da goi ham tim kiem");
				break;
			}
			case 6:{
				System.out.println("tong tien sach tham khao: " + totalstk());
				System.out.println("tong tien sach giao khoa: " + totalsgk());
				break;
			}
		}
	}
		
}
