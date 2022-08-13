import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Person o) {
		//return name.compareTo(o.name);// sorting String in alphabetic order
		//return -name.compareTo(o.name);// sorting String in reverse alphabetic order
		// sorting by the String length
		int l1 = name.length();
		int l2 = o.name.length();
		// cannot differ Ann & Bob! 
		/*if(l1 > l2) return 1;
		return (l1 == l2) ? 0 : -1;
		*/
		if(l1 == l2) return name.compareTo(o.name);
		return (l1 > l2) ? 1 : -1;
	}
}

public class App {
	
	public static void main(String[] args) {
	ArrayList<Person> list = new ArrayList<>();
	addElements(list);
	System.out.println(list);
	
	Collections.sort(list);
	System.out.println(list);
	
	SortedSet<Person> set = new TreeSet<>();
	addElements(set);
	System.out.println(set);
	
	}
	
	private static void addElements(Collection<Person> col) {
		col.add(new Person("Mike"));
		col.add(new Person("Johnathan"));
		col.add(new Person("Sue"));
		col.add(new Person("Ann"));
		col.add(new Person("Bob"));
	}

}
