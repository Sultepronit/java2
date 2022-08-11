import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
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
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
}

public class App {

	public static void main(String[] args) {
		
		//HashMap<String, Integer> map = new HashMap<>();
		Map<String, Integer> map = new LinkedHashMap<>();
		
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("one", 1);
		
		for(String key: map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("cat");
		set.add("dog");
		set.add("mouse");
		set.add("cat");
		
		System.out.println(set);
		
		//------------------------------------------------------------
		
		// without equals method cannot tell apart p2 & p4
		Person p1 = new Person(0, "Bob");
		Person p2 = new Person(1, "Sue");
		Person p3 = new Person(2, "John");
		Person p4 = new Person(1, "Sue");
		
		Map<Person, Integer> map2 = new LinkedHashMap<>();
		map2.put(p1, 1);
		map2.put(p2, 2);
		map2.put(p3, 3);
		map2.put(p4, 1);
		
		for(Person key: map2.keySet()) {
			System.out.println(key + ": " + map2.get(key));
		}
		
		Set<Person> set2 = new LinkedHashSet<>();
		set2.add(p1);
		set2.add(p2);
		set2.add(p3);
		set2.add(p4);
		System.out.println(set2);
	}

}
