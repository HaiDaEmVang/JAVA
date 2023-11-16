package quanlysach;

import java.util.Date;

public class SACHTHAMKHAO extends SACH implements ISACH{
	private double thue;
	
	
	public SACHTHAMKHAO(String masach, String nhaxuatban, Date ngaynhap, double dongia, int soluong, double thue) {
		super(masach, nhaxuatban, ngaynhap, dongia, soluong);
		this.thue = thue;
	}
	
	public SACHTHAMKHAO(String masach, String nhaxuatban, Date ngaynhap, double dongia, int soluong) {
		super(masach, nhaxuatban, ngaynhap, dongia, soluong);
	}
	
	public SACHTHAMKHAO() {
		super();
	}
	
	public void nhap(){
		super.nhap();
		System.out.println("Nhap vao thue: ");
		this.thue = super.sc.nextDouble();
		sc.nextLine();
	}
	public String xuat() {
		return super.xuat() + " thue: "+ this.thue;
	}
	@Override
	public double TinhThanhTien() {
		// TODO Auto-generated method stub
		return this.soluong * this.dongia - this.tiengiam() + this.thue;
	}

	@Override
	public double tiengiam() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}
	
}
