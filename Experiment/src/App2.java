
public class App2 {
	
	static long actualNumber = 0l;
	static long result = 0l;

	public static void main(String[] args) {
		int order = 1;
		long orderChange = 10;
		for(actualNumber = 1; actualNumber < 999; actualNumber++) {
			if(actualNumber == orderChange) {
				order ++;
				orderChange *= 10;
			}
			result = 0l;
			//System.out.print(actualNumber + ": ");
			goThroughNumber(actualNumber, order);
			if(actualNumber == result) System.out.println(result);
		}

	}
	
	public static void goThroughNumber(long number, int order) {
		
		while(order >= 0) {
			if(order == 1) {
				result += number;
				break;
			}
			
			long lastDigit = number % 10;
			long power = lastDigit;
			for(int i = 1; i < order; i++) {
				power *= lastDigit;
			}
			result += power;
			//System.out.println(lastDigit + ": " + power);
			//System.out.print(result + " ");
				
			if(result > actualNumber) {
				//System.out.print("Too big! ");
				break;
			}
			
			if(result*2 < actualNumber) {
				//System.out.print("Too small! ");
				break;
			}
			number /= 10; order--;
		}
	}
	
	public static void goThroughNumber2(long number, int order) {
		
		if(order == 1) {
			result += number;
			return;
		}
		
		long lastDigit = number % 10;
		long power = lastDigit;
			for(int i = 1; i < order; i++) {
				power *= lastDigit;
			}
			result += power;
		//System.out.println(lastDigit + ": " + power);
			System.out.println(result);
			
		if(result > actualNumber) {
			System.out.println("Too big!");
			return;
		}
		
		if(result*2 < actualNumber) {
			System.out.println("Too small!");
			return;
		}
		
		goThroughNumber(number/10, --order);
		//return power + goThroughNumber(number/10, --order);
		//return 0;
	}
	

}
