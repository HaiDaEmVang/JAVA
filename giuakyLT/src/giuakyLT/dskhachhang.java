package giuakyLT;

import java.util.Hashtable;
import java.util.Scanner;



public class dskhachhang {
	protected Hashtable<String, khachhang> lists;
	
	protected Scanner sc;

	public dskhachhang(Hashtable<String, khachhang> lists) {
		super();
		this.lists = lists;
		sc = new Scanner(System.in);
	}
	
	public dskhachhang() {
		this.lists = new Hashtable<String, khachhang>();
		sc = new Scanner(System.in);
	}
	
	
	public void addcustomer(){
		khachhang k;
		System.out.println("Nhap vao so luong khachhang can them: ");
		int n = sc.nextInt();
		for(int i = 0; i< n; i++) {
			System.out.println("Nhap vao loai khachhang (1. khach hang viet nam|| 2.khach hang nuoc ngoai): ");
			int n1 = sc.nextInt();
			if(n1 == 1) {
				k = new khachhangvietnam();
			}else {
				k = new khachhangnuocngoai();
			}
			k.nhap();
			lists.put(k.getMakhachhang(), k);
		}
	}
	public void delcustomer() {
		sc.nextLine();
		String tmp;
		System.out.println("Nhap vao ma khachhang can xoa: ");
		tmp = sc.nextLine();
		if(lists.containsKey(tmp))
			lists.remove(tmp);
	}
	public void updatecustomer(){
		sc.nextLine();
		String makh;
		int n;
		boolean flag = false;
		System.out.println("Nhap vao ma sach can cap nhat: ");
		makh = sc.nextLine();
		if(lists.containsKey(makh)) {
			 khachhang k = lists.get(makh);
			System.out.println("nhap vao truong can thay doi gia " +
			 "tri(1,ma khach hang 2,ten khach hang 3, ngay ra hoa don 4, soluong 5, don gia");
			n = sc.nextInt();
			sc.nextLine();
			
			switch(n) {
				case 1:{
					System.out.println("nhap ma khachhang moi: ");
					k.setMakhachhang(sc.nextLine());
					lists.put(k.getMakhachhang(), k);
					lists.remove(makh);
					break;
				}
				case 2:{
					System.out.println("nhap ten khach hang moi: ");
					k.setHoten(sc.nextLine());
					break;
				}
				case 3:{
					System.out.println("nhap ngay nhay ra hoa don moi: ");
					k.setNgayrahoadon(sc.nextLine());
					break;
				}
				
				case 4:{
					System.out.println("nhap so luong ban moi: ");
					k.setSoluong(sc.nextInt());
					sc.nextLine();
					break;
				}
				case 5:{
					System.out.println("nhap don gia ban moi: ");
					k.setDongia(sc.nextDouble());
					sc.nextLine();
					break;
				}
			}
		}else {
			System.out.println("ko ton khach hang duoc nhap trong danh sach");
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
		System.out.println("Nhap vao ma khach hang can tim: ");
		masach = sc.nextLine();
		if(lists.containsKey(masach))
			return lists.get(masach).xuat();
		return "khon tim thay khach hang can tim";
	}
	
	
	public double totalvn() {
		double sumvn = 0;
		for(String k: lists.keySet()) {
			if(lists.get(k) instanceof khachhangvietnam) {
				sumvn+= lists.get(k).soluong;
			}
		}
		return sumvn;
	}
	public double totaluk() {
		double sumuk = 0;
		for(String k: lists.keySet()) {
			if(lists.get(k) instanceof khachhangnuocngoai) {
				sumuk+= lists.get(k).soluong;
			}
		}
		return sumuk;
	}

	public Hashtable<String, khachhang> getLists() {
		return lists;
	}

	public void setLists(Hashtable<String, khachhang> lists) {
		this.lists = lists;
	}
}
