package BAITAPKETHUA;

import java.util.Arrays;

public class arrHinh {
	private int n;
	private hinh[] arrH = new hinh[10];
	
	static int index = 0;
	public void addHinh(hinh h) {
		arrH[index++] = h;
	}

	public void xuatArr() {
		for(hinh h : arrH)
			h.toString();
	}
}
