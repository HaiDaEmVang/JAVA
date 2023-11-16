package BAI2;

import java.util.Scanner;

public class fibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int[] a = new int[n];
		System.out.println( fibo(n));
		for(int i = 0; i< n; i++) {
			a[i] = fibo(i); 
		}
		for(int i: a) {
			System.out.println(" "+ i);
		}
	}//0 1 1 2 3 5
	public static int fibo(int a) {
		if(a <= 1)
			return a;
		else {
			return fibo(a-1)+ fibo(a-2);
		}
	}
}
