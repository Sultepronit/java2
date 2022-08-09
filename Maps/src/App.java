import java.util.HashMap;
import java.util.Map;

public class App {
	public static void main(String args[]) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(5, "five");
		map.put(3, "three");
		map.put(7, "seven");
		map.put(6, "six");
		map.put(2, "two");
		
		System.out.println(map.get(7));
		System.out.println(map.get(1));
		
		map.put(7, "nana");
		System.out.println(map.get(7));
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " + value);
		}
	}
}
