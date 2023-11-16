package BUOI2;

import java.util.Scanner;

public class BAI2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		int[] arr = new int[a];
		for(int i = 0; i< a;i++) {
			int c = sc.nextInt();
			arr[i] = c;
		}
		for(int i = 0; i < a; i++) {
			System.out.println(arr[i]);
		}
	}
}
