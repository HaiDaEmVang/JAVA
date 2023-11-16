package coCaRo;

public class Board {
	public String[] board = {" "," "," "," "," "," "," "," "," "};
	
	public void displayBoard() {
		System.out.println(" "+this.board[0]+" | "+ this.board[1]+" | " + this.board[2] );
		System.out.println(" ---------");
		System.out.println(" "+this.board[3]+" | "+ this.board[4]+" | " + this.board[5] );
		System.out.println(" ---------");
		System.out.println(" "+this.board[6]+" | "+ this.board[7]+" | " + this.board[8] );
		System.out.println(" ---------");
	}
	public void setBoard(int n, String loai) {
		this.board[n-1] = loai;
	}
	
	public void setAllBoard() {
		for(String x: board) {
			x = " ";
		}
	}
	
}
