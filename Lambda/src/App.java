// functional interface -- interface with a single method, that can be used by lambda expression
interface Executable {
	void execute();
}


class Runner {
	public void run(Executable e) {
		System.out.println("Executing code block ....");
		e.execute();
	}
}

public class App {

	public static void main(String[] args) {
		Runner runner = new Runner();
		
		// non lambda
		runner.run(new Executable() {
			public void execute() {
				System.out.println("Hello there!");
			}
		});
		
		System.out.println();
		
		// lambda
		runner.run(() -> System.out.println("Hello there!"));
		
		System.out.println();
		
		runner.run(() -> {
			System.out.println("Hello there!");
			System.out.println("Another line...");
		});
	}

}
