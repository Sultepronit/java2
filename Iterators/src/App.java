import java.util.Iterator;
import java.util.LinkedList;

public class App {
	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<>();
		animals.add("fox");
		animals.add("cat");
		animals.add("frog");
		animals.add("lion");
		
		Iterator<String> it = animals.iterator(); 
		
		while(it.hasNext()) {
			String animal = it.next();
			System.out.println(animal);
			
			if(animal.equals("cat")) it.remove();
		}
		System.out.println(animals);
		
		for(int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i));
			if(animals.get(i).equals("lion")) animals.remove(i);
		}
		
		System.out.println(animals);
	}
	
}
