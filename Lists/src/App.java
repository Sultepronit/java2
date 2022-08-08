import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		// both implements List interface
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);

	}
	
	private static void doTimings(String type, List<Integer> list) {
		for(int i = 0; i < 1e5; i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		/*
		// add items at end of list
		for(int i = 0; i < 1e5; i++) {
			list.add(i);
		}
		*/
		
		// add items elsewhere
		for(int i = 0; i < 1e5; i++) {
			//list.add(0, i);
			//list.add(1000, i);
			//list.add(2000, i);
			int ind = list.size() - 1000;
			list.add(ind, i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: " + (end - start) + " ms for " + type);
		
	}

}
