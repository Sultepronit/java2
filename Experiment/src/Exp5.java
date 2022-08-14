
public class Exp5 {
	
	private static int dd;
	private static int nn;
	private static int re = 0;
	
	
	public static void main(String args[]) {
		int n = 10000;
		//int n = 47;
		//int d = 3;
		//int n = 15;
		int d = 1;
		dd = d;
		nn = n;
		
		for(int a = 1; a < 9; a++) {
			if(a * 10 > n) break;
			nextDigit(a * 10, a);
		}
		System.out.println("re:" + re);
	}
	
	private static void nextDigit(int number, int a) {
		number += a;
		for(int b = a + 1; (b - a) <= dd; b++) {
				number++;
				if(number > nn) break;
				re++;
				System.out.println(number);
				if(b >= 9) break;
				nextDigit(number * 10, b);
			}
	}
}
