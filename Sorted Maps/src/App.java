import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		
		// may be ordered naturally, but not always!
		HashMap<Integer, String> hashMap = new HashMap<>();
		// placed in order of addition
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		// ordered naturally
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		//testMap(hashMap);
		//testMap(linkedHashMap);
		testMap(treeMap);
	}
	
	public static void testMap(Map<Integer, String> map) {
		map.put(5, "five");
		map.put(3, "three");
		map.put(0, "zero");
		map.put(6, "six");
		map.put(2, "two");
		map.put(12, "twelve");
		map.put(-1, "minus");
		
		for(Integer key: map.keySet()) {
			String value = map.get(key);
			
			System.out.println(key + ": " + value);
		}
	}

}
