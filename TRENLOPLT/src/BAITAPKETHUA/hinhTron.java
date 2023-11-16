package BAITAPKETHUA;

public class hinhTron extends hinh{
	private double r;
	
	public hinhTron (String name, String mau, boolean tomau, double r) {
		super(name, mau, tomau);
		this.r = r;
	}
	@Override
	public String toString() {
		
		return ( super.toString()+ " hinhTron [r=" + r + "]");
	}
	
	public double dientich() {
		return Math.PI * Math.pow(this.r, 2);
	}
	public double chuvi() {
		return 2*Math.PI*this.r;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	
	
}
