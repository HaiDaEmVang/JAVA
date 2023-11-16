package BUOI2;

import java.util.Scanner;

public class BAI1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		do {
			System.out.println("Nhap vao a: ");
			a = sc.nextInt();
			System.out.println("Nhap vao b: ");
			b = sc.nextInt();
		}while(b == 0);

		float c = (float)a/b;
		System.out.println("Thuong cua a va b la: "+ (float)Math.ceil(c*100)/100);
	}
}
