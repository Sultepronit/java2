
public class App {

	public static void main(String[] args) {
		App app = new App();
		
		Person person = new Person("Mike");
		System.out.println("1. " + person);
		
		app.show(person);
		System.out.println("5. " + person);
		
		System.out.println();
		//----------------------------------------
		
		//int[] array = new int[] {1,2,3,4};
		int[] array = {1,2,3,4};
		System.out.println("1. " + array[0]);
		
		app.show(array);
		System.out.println("4. " + array[0]);
	}
	
	public void show(Person person) {
		// we get new link to the object
		System.out.println("2. " + person);
		
		// we changed the object
		person.setName("John");
		System.out.println("3. " + person);
		
		// now, we get new object in our method
		person = new Person("Ann");
		System.out.println("4. " + person);
	}
	
	public void show(int[] array) { 
		// we get new link to the array 
		System.out.println("2. " + array[0]);
		
		// we changed the contents of the array
		array[0] = -1;
		System.out.println("3. " + array[0]);
	}

}
