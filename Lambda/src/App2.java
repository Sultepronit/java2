// functional interface -- interface with a single method, that can be used by lambda expression
interface Executable2 {
	int execute();
}


class Runner2 {
	public void run(Executable2 e) {
		System.out.println("Executing code block ....");
		int value = e.execute();
		System.out.println("Returned value: " + value);
	}
}

public class App2 {

	public static void main(String[] args) {
		Runner2 runner = new Runner2();
		
		// non lambda
		runner.run(new Executable2() {
			public int execute() {
				System.out.println("Hello there!");
				return 7;
			}
		});
		
		System.out.println();
		
		// lambda
		runner.run(() -> {
			System.out.println("Hello there!");
			System.out.println("Another line...");
			return 8;
		});
		
		System.out.println();
		
		runner.run(() -> 9);
	}

}
