import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App2 {

	public static void main(String[] args) {

		for (int i = 0; i <= 1e4; i += 1000) {

			ArrayList<Integer> arrayList = new ArrayList<>();
			LinkedList<Integer> linkedList = new LinkedList<>();
			initiate(arrayList);
			initiate(linkedList);

			System.out.print(i + ": ");
			doTimings(i, arrayList);
			System.out.print(" / ");
			doTimings(i, linkedList);
			System.out.println();
		}

	}

	private static void initiate(List<Integer> list) {
		for (int i = 0; i < 1e4; i++) {
			list.add(i);
		}
	}

	private static void doTimings(int index, List<Integer> list) {

		long start = System.currentTimeMillis();

		for (int i = 0; i < 1e5; i++) {
			list.add(index, i);
		}

		long end = System.currentTimeMillis();

		System.out.print(end - start);

	}

}
