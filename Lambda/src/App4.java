// functional interface -- interface with a single method, that can be used by lambda expression
interface StringExecutable {
	String execute(String a);
}

interface Executable4 {
	int execute(int a, int b);
}



class Runner4 {
	public void run(Executable3 e) {
		System.out.println("Executing code block ....");
		int value = e.execute(12);
		System.out.println("Returned value: " + value);
	}
	
	public void run(StringExecutable e) {
		System.out.println("Executing code block ....");
		String value = e.execute("Hello ");
		System.out.println("Returned value: " + value);
	}
	
	public void run(Executable4 e) {
		System.out.println("Executing code block ....");
		int value = e.execute(10, 20);
		System.out.println("Returned value: " + value);
	}
}

public class App4 {

	public static void main(String[] args) {
		Runner4 runner = new Runner4();
		
		// error!!!
		//runner.run((a) -> 9 + a);
		
		runner.run((int a) -> 9 + a);
		
		runner.run((String s) -> s + "world!");
		
		runner.run((a, b) -> a + b);
		
		// more simple ways!
		Executable4 ex = (a, b) -> a + b + 10000;
		runner.run(ex);
		System.out.println("Simple way: " + ex.execute(3, 10));
		
		Executable4 ex2 = (a, b) -> {
			int result = a + b + 10000;
			System.out.println("One more simple way: " + result);
			return result;
		};
		ex2.execute(11, 22);
		
		Object obj = (Executable4) (a, b) -> a + b + 10000;
		System.out.println("Not so simple way: " + ((Executable4) obj).execute(33, 100) );
		
		//////// variables and scopes
		int c = 100;
		// error! "must be final or effectively final"
		//c = 200;
		
		runner.run((a, b) -> a + b + c);
		
		int d = 1000;
		// non lambda
		runner.run(new Executable4() {
			public int execute(int a, int b) {
				// we can use d from above or create local one
				int d = 33;
				return a + b + c + d;
			}
		});
		// lambda
		runner.run((a, b) -> {
			// we cannot declare local d!!!
			//int d = 55;
			return a + b + c + d;
		});

	}

}
