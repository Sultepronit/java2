import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
}

class StringLengthComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		int l1 = o1.length();
		int l2 = o2.length();
		if(l1 > l2) return 1;
		if(l1 < l2) return -1;
		return 0;
	}
}

class ReverseAlphabeticalComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
	return -o1.compareTo(o2); //.compareTo() is sorting alphabetically 
	}
}

public class App {

	public static void main(String[] args) {
		 
		ArrayList<String> animals = new ArrayList<>();
		animals.add("cat");
		animals.add("dog");
		animals.add("snake");
		animals.add("tiger");
		animals.add("horse");
		animals.add("lion");
		System.out.println(animals);
		
		// alphabetic
		//Collections.sort(animals);
		// String length
		//Collections.sort(animals, new StringLengthComparator());
		Collections.sort(animals, new ReverseAlphabeticalComparator());
		
		System.out.println(animals); 
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(77);
		numbers.add(5);
		numbers.add(45);
		numbers.add(3);
		numbers.add(83);
		System.out.println(numbers);
		
		//Collections.sort(numbers);
		
		// anonymous class implementing Comparator interface 
		Collections.sort(numbers, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return -o1.compareTo(o2);
			}
		});
		System.out.println(numbers); 
		
		///////////// Sorting arbitrary objects
		ArrayList<Person> people = new ArrayList<>();
		people.add(new Person(1, "John"));
		people.add(new Person(4, "Ann"));
		people.add(new Person(2, "Mike"));
		people.add(new Person(3, "Jim"));
		
		System.out.println(people);
		
		// cannot sort by default
		//Collections.sort(people);
		Collections.sort(people, new Comparator<Person>() {
			public int compare(Person o1, Person o2) {
				// sort by id
				/*if(o1.getId() > o2.getId()) return 1;
				if(o1.getId() < o2.getId()) return -1;
				return 0;*/
				
				// sort by name
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		System.out.println(people);

	}

}
