// functional interface -- interface with a single method, that can be used by lambda expression
interface Executable3 {
	int execute(int a);
}

class Runner3 {
	public void run(Executable3 e) {
		System.out.println("Executing code block ....");
		int value = e.execute(12);
		System.out.println("Returned value: " + value);
	}
}

public class App3 {

	public static void main(String[] args) {
		Runner3 runner = new Runner3();
		
		// lambda
		
		runner.run((int a) -> 9 + a);
		
		System.out.println();
		
		runner.run((a) -> 10 + a);
		
		System.out.println();
		
		runner.run(a -> 20 + a);
		
		System.out.println();
		
		runner.run((b) -> { // functional interface describes that there must be a method with int argument
			System.out.println("Lambda is working!");
			return 9 + b;
		});
	}

}
