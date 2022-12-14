import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {

	public static String[] vehicles = {
			"ambulance", "helicopter", "lifeboat"	
	};
	
	public static String[][] drivers = {
			{"Fred", "Sue", "Pete"},
			{"Sue", "Richard", "Bob", "Fred"},
			{"Pete", "Mary", "Bob"}
	};
	
	public static void main(String[] args) {
		
		Map<String, Set<String>> personnel = new HashMap<>();
		
		for(int i = 0; i < vehicles.length; i++) {
			String vehicle = vehicles[i];
			String[] driverList = drivers[i];
			
			Set<String> driverSet = new LinkedHashSet<>();
			
			for(String dirver: driverList) {
				driverSet.add(dirver);
			}
			
			personnel.put(vehicle, driverSet);
		}
		
		Set<String> driverList = personnel.get("helicopter");
		
		System.out.println(driverList);
		
		System.out.println(personnel);
		
		for(String vehicle: personnel.keySet()) {
			Set<String> driverList2 = personnel.get(vehicle);
			System.out.println(vehicle + ": " + driverList2);
		}

	}

}
