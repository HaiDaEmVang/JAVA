package buoi3;
import java.util.Scanner;
class main{

	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    int q = sc.nextInt();
	    
	    while(q >= 0){
	        q--;
	        int a, b, n;
	        a = sc.nextInt();
	        b = sc.nextInt();
	        n = sc.nextInt();
	        
	        int s = a;
	        for(int i = 0 ; i< n; i++){
	            s += (int)Math.pow(2, i)*b;
	            System.out.print(s + " ");
	        }
	        System.out.print("\n");
	    }
	}
}
