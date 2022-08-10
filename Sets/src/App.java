import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		
		// HashSet does not retain order
		//Set<String> set1 = new HashSet<>();
		
		// LinkedHashSet remembers the order you added items in
		//Set<String> set1 = new LinkedHashSet<>();
		
		// TreeSet sorts in natural order
		Set<String> set1 = new TreeSet<>();
		
		if(set1.isEmpty()) {
			System.out.println("Empty!");
		}
		
		set1.add("cat");
		set1.add("dog");
		set1.add("bird");
		set1.add("snake");
		set1.add("elephant");
		
		System.out.println(set1);
		
		// no effect
		set1.add("bird");
		System.out.println(set1);
			
		for(String element: set1) {
			System.out.println(element);
		}
		
		if(set1.contains("frog")) {
			System.out.println("Contains frog");
		}
		else {
			System.out.println("No frog");
		}
		
		
		Set<String> set2 = new TreeSet<>();
		set2.add("cat");
		set2.add("ant");
		set2.add("bird");
		set2.add("giraffe");
		set2.add("monkey");
		System.out.println(set2);
		
		////// intersection
		Set<String> intersection = new HashSet<>(set1);
		System.out.println(intersection);
		
		intersection.retainAll(set2);
		System.out.println(intersection);
		
		//////////// difference
		Set<String> difference = new HashSet<>(set1);
		difference.removeAll(set2);
		System.out.println(difference);
	}

}
