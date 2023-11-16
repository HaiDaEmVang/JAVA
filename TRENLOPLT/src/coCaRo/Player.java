package coCaRo;

import java.util.Scanner;

public class Player {
	private String Name;
	private String Loai;
	
	static Boolean flag = true;
	static String flag_Loai;
	public Player() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ten nguoi choi: ");
		this.Name = sc.nextLine();
		if(flag) {
			System.out.println("Nhap vao loai: ");
			String loai = sc.nextLine().toUpperCase();
			flag_Loai = loai;
			this.Loai = loai;
			flag = false;
		}else {
			if(flag_Loai.equalsIgnoreCase("X")) {
				this.Loai = "O";
			}else 
				this.Loai = "X";
			flag = true;
		}	
	}
	public String getName() {
		return this.Name;
	}
	public String getLoai() {
		return this.Loai;
	}
	@Override
	public String toString() {
		return "Player Name: " + Name + ", Loai: " + Loai;
	}

	public String toString1() {
		return "Player Name: " + Name + ", Loai: " + Loai +" win";
	}
	
}
