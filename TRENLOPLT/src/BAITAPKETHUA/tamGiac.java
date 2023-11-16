package BAITAPKETHUA;

public class tamGiac extends hinh{
	private int a, b, c;
	
	public tamGiac() {
		a = b = c = 1;
	}
	public tamGiac(int a, int b, int c) {
//		super.nhap();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public tamGiac(String name, String mau, boolean tomau, int a, int b, int c) {
		super(name, mau, tomau);
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public void nhap() {
		super.nhap();
		do {
			System.out.println("Nhap vao ba canh tam giac: ");
			this.a = sc.nextInt();
			this.b = sc.nextInt();
			this.c = sc.nextInt();
		}while(a>= b + c ||b >= a + c || c >= a + b);	
	}
	@Override
	public String toString() {
		
		return super.toString()+"3 canh cua tam giac la: "+ this.a+" "+ this.b+ " " + this.c + " " ;
	}
	public double chuvi() {
		return this.a + this.b + this.c;
	}
	public double dientich() {
		double p = (a + b + c)/2.0;
		return Math.sqrt(p * p -a * p - b * p - c);
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
	
}
