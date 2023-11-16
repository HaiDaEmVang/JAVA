package coCaRo;

import java.util.Scanner;

public class Game {
	public void dien(Scanner sc, Player o, Board B) {
		int n;
		do {
			System.out.println(o.toString());
			System.out.println("Nhap vao lua chon vi tri danh(1 - 9): ");
			n = sc.nextInt();
		}while(n<=0 || n>9);
		
		B.setBoard(n, o.getLoai());
		B.displayBoard();
	}
	public boolean check(Player o, Board B, int a, int b, int c) {
		if(B.board[a] == o.getLoai() && B.board[b] == o.getLoai() && B.board[c] == o.getLoai())
			return true;
		return false;
	}
	public boolean check2(Player o, Board B) {
		if(check(o, B, 0, 1, 2))
			return true;
		if(check(o, B, 3, 4, 5))
			return true;
		if(check(o, B, 6, 7, 8))
			return true;
		if(check(o, B, 0, 3, 6))
			return true;
		if(check(o, B, 1, 4, 7))
			return true;
		if(check(o, B, 2, 5, 8))
			return true;
		if(check(o, B, 2, 4, 6))
			return true;
		if(check(o, B, 0, 4, 8))
			return true;
		return false;
	}
	public void play() {
		Scanner sc = new Scanner(System.in);
		
		Player p2 = new Player();
		Player p1 = new Player();
		
		Board B = new Board();
		
		int cnt = 0;
		boolean flag = false;
		while(cnt <= 8) {
			if(flag) {
				this.dien(sc, p1, B);
				if(check2(p1, B)) {
					System.out.println(p1.toString1());
					B.setAllBoard();
					cnt = 0;
					break;
				}
				flag = false;
			}else {
				this.dien(sc, p2, B);
				if(check2(p2, B)) {
					System.out.println(p2.toString1());
					B.setAllBoard();
					cnt = 0;
					break;
				}
				flag = true;
			}
			if(cnt == 8)
				System.out.println("Hoa!!!!!!");
			cnt++;
		}
	}
}
