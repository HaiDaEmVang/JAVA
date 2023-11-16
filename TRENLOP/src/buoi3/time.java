package buoi3;

import java.util.Calendar;
import java.util.Scanner;

public class time {
	protected int ngay;
	protected int thang;
	protected int nam;
	protected Scanner sc = new Scanner(System.in);
	
	public time() {
		
	}
	public time(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	
	public void nhap() {
		sc.nextLine();
		do {
			System.out.println("Nhap vao ngay: ");
			this.ngay = sc.nextInt();
		}while(this.ngay < 0 || this.ngay > 31);
		do {
			System.out.println("Nhap vao thang: ");
			this.thang = sc.nextInt();
		}while(this.thang < 0 || this.thang > 12);
		Calendar cal = Calendar.getInstance();
		do {
			System.out.println("Nhap vao nam: ");
			this.nam = sc.nextInt();
		}while(this.nam < 0  || this.nam > cal.get(Calendar.YEAR));
		
	}
	@Override
	public String toString () {
		return this.ngay +"/" + this.thang + "/" + this.nam;
	}
}
