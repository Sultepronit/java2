
public class App {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 9; i++) {
			System.out.println(i + " : " + i*i + " / "+ i*i*i + " / " + i*i*i*i + " / " + i*i*i*i*i);
		}
		
		for(int ten = 1; ten <= 9; ten++) {
			//System.out.println(ten*ten);
			int ten2 = ten*ten;
			for(int one = 8; one <= 9; one++) {
				//System.out.println("" + ten + one + ": " + ten2 + " + " + one);
			}
		}
		
		for(int one = 1; one <= 9; one++) {
			int one2 = one*one;
			if(one2/10 < 1) continue;
			//for(int ten = 1; ten <= 9; ten++) {
			for(int ten = one2/10; ten <= 9; ten++) {
				int sum = ten+one2;
				
				if( (9 + one2) < (ten*10 + one) ) {
					System.out.println("Too small: " + (9 + one2) + " < " + (ten*10 + one));
					break;
				}
				
				System.out.println("" + ten + one + ": " + sum + " = " + ten + " + " + one2);
			}
		}
		
		System.out.println("--------------------------------------");
		for(int one = 1; one <= 9; one++) {
			int one2 = one*one*one;
			if(one2/100 < 1) continue;
			for(int ten = 1; ten <= 9; ten++) {
			//for(int ten = one2/100; ten <= 9; ten++) {
				int ten2 = ten*ten;
				int sum = ten2+one2;
				
				/*if( (9*9 + one2) < (ten2*10 + one2) ) {
					System.out.println("Too small: " + (9*9 + one2) + " < " + (ten2*10 + one2));
					break;
				}*/
				
				System.out.println("x" + ten + one + ": " + sum + " = " + ten2 + " + " + one2);
			}
		}

	}

}
